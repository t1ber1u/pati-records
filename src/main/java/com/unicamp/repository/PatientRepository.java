package com.unicamp.repository;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;

import com.unicamp.entity.Patient;

public class PatientRepository implements IPatientRepository {

	@Inject
	private javax.inject.Provider<Session> _session;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Patient> getAllPatients() {
		
		Session session = _session.get();
		session.beginTransaction();

		return session.createCriteria(Patient.class).list();
	}

	@Override
	public Patient addPatient(Patient patient) {
		
		Session session = _session.get();
		session.beginTransaction();
		
		session.save(patient);
		
		session.getTransaction().commit();

		return patient;
	}

	@Override
	public Patient getPatientById(int patientId) {

		Session session = _session.get();
		session.beginTransaction();

		return session.get(Patient.class, patientId);
	}

}
