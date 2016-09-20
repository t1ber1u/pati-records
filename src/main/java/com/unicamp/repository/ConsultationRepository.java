package com.unicamp.repository;

import com.unicamp.entity.Consultation;
import org.hibernate.Session;

import javax.inject.Inject;

public class ConsultationRepository implements IConsultationRepository {

    @Inject
    private javax.inject.Provider<Session> _session;

    @Override
    public Consultation addConsultation(Consultation consultation) {
        Session session = _session.get();
        session.beginTransaction();

        session.save(consultation);

        session.getTransaction().commit();

        return consultation;
    }
}
