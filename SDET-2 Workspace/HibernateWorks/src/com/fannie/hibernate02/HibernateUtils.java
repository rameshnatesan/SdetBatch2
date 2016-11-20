package com.fannie.hibernate02;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	static SessionFactory factory = null;
	
	public static SessionFactory getFactory(){
		// for the configure() method you may pass the values 
		// which is optional when the hibernate config file named 
		// is hibernate.cfg.xml if not you have to pass file or 
		// stirng 
		
//		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		Configuration config = new Configuration().configure();

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(config.getProperties());
		
		factory = config.buildSessionFactory(builder.build());
		
		return factory;
	}
	

	public static SessionFactory getFactory(String name){
		// for the configure() method you may pass the values 
		// which is optional when the hibernate config file named 
		// is hibernate.cfg.xml if not you have to pass file or 
		// stirng 
		
//		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		Configuration config = new Configuration().configure(name);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(config.getProperties());
		
		factory = config.buildSessionFactory(builder.build());
		
		return factory;
	}
	
	
	
	
}
