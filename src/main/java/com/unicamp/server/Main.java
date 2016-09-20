package com.unicamp.server;

import com.unicamp.repository.ConsultationRepository;
import com.unicamp.repository.IConsultationRepository;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.grizzly.http.server.StaticHttpHandler;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.moxy.json.MoxyJsonConfig;
import org.glassfish.jersey.process.internal.RequestScoped;
import org.glassfish.jersey.server.ResourceConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.unicamp.repository.IPatientRepository;
import com.unicamp.repository.PatientRepository;

import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;
import javax.ws.rs.ext.ContextResolver;

public class Main {

    public static final String BASE_URI = "http://localhost:8080/api/";

    public static HttpServer startServer() {
        
    	final ResourceConfig rc = new ResourceConfig()
    			.packages("com.unicamp.controllers")
    			.packages("org.glassfish.jersey.examples.jsonmoxy")
                .register(createMoxyJsonResolver())
                .register(ThrowableExceptionMapper.class)
                .register(new DependencyBinder());
    	
    	return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }
    
    public static ContextResolver<MoxyJsonConfig> createMoxyJsonResolver() {
        final MoxyJsonConfig moxyJsonConfig = new MoxyJsonConfig();
        Map<String, String> namespacePrefixMapper = new HashMap<String, String>(1);
        namespacePrefixMapper.put("http://www.w3.org/2001/XMLSchema-instance", "xsi");
        moxyJsonConfig.setNamespacePrefixMapper(namespacePrefixMapper).setNamespaceSeparator(':');
        return moxyJsonConfig.resolver();
    }

    public static void main(String[] args) throws IOException {
    	
        final HttpServer server = startServer();
        
        StaticHttpHandler staticHttpHandler = new StaticHttpHandler("src/main/public/");
        server.getServerConfiguration().addHttpHandler(staticHttpHandler, "/");
        
        System.out.println(String.format("Jersey app started with WADL available at "
        									+ "%sapplication.wadl\nHit enter to stop it...", BASE_URI));
        System.in.read();
        
        server.shutdown();
    }
    
    public static class DependencyBinder extends AbstractBinder {

        @Override
        protected void configure() {
            
        	bind(PatientRepository.class).to(IPatientRepository.class).in(RequestScoped.class);
        	bind(ConsultationRepository.class).to(IConsultationRepository.class).in(RequestScoped.class);
        	bindFactory(SessionFactoryFactory.class).to(SessionFactory.class).in(Singleton.class);
		    bindFactory(SFFactory.class).to(Session.class).in(RequestScoped.class);
    	}
    }
}

