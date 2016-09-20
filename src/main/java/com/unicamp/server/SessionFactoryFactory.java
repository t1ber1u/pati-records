package com.unicamp.server;

import java.util.Properties;

import com.unicamp.entity.Consultation;
import org.glassfish.hk2.api.Factory;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.unicamp.entity.Patient;

public class SessionFactoryFactory implements Factory<SessionFactory> {

	private final SessionFactory factory;
	
	public SessionFactoryFactory() {
		
		Properties prop= new Properties();
		
		prop.setProperty("hibernate.connection.url", "jdbc:mysql://192.168.100.99:3306/pep");
		prop.setProperty("hibernate.connection.username", "app");
		prop.setProperty("hibernate.connection.password", "");
		prop.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
		
		Configuration configuration = new Configuration()
				.addPackage("com.unicamp.entity")
				.addProperties(prop)
				.addAnnotatedClass(Patient.class)
				.addAnnotatedClass(Consultation.class);
		
        StandardServiceRegistryBuilder srBuilder = new StandardServiceRegistryBuilder();
        srBuilder.applySettings(configuration.getProperties());
        factory = configuration.buildSessionFactory(srBuilder.build());
	}
		
	@Override
	public void dispose(SessionFactory arg0) {
		factory.close();
	}

	@Override
	public SessionFactory provide() {
        return factory;
	}

}
