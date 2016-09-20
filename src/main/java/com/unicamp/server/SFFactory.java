package com.unicamp.server;

import javax.inject.Inject;

import org.glassfish.hk2.api.Factory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SFFactory implements Factory<Session>  {

	private final SessionFactory factory;

    @Inject
    public SFFactory(SessionFactory factory) {
        this.factory = factory;
    }
	
	@Override
	public void dispose(Session session) {
		if (session.isOpen()) {
            session.close();
        }
	}

	@Override
	public Session provide() {
        return factory.openSession();
	}

}
