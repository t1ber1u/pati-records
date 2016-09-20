package com.unicamp.repository;

import java.util.List;

import com.unicamp.entity.AuditEvent;

public interface IAuditEventRepository {

	List<AuditEvent> getAllAuditEvents();
	AuditEvent addAuditEvent(AuditEvent auditEvent);
}
