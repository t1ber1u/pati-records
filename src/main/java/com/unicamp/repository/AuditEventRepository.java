package com.unicamp.repository;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;

import com.unicamp.entity.AuditEvent;

public class AuditEventRepository implements IAuditEventRepository {

	@Inject
	private javax.inject.Provider<Session> _session;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<AuditEvent> getAllAuditEvents() {
		
		Session session = _session.get();
		session.beginTransaction();
		
		List<AuditEvent> auditEvents = session.createCriteria(AuditEvent.class).list();
		
		session.close();
		
		return auditEvents;
	}

	@Override
	public AuditEvent addAuditEvent(AuditEvent auditEvent) {
		
		Session session = _session.get();
		session.beginTransaction();
		
		session.save(auditEvent);
		
		session.getTransaction().commit();
		session.close();
		
		return auditEvent;
	}
	
}
