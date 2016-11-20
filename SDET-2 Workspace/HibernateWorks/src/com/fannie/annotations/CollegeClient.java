package com.fannie.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.fannie.hibernate02.HibernateUtils;

public class CollegeClient {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtils.getFactory("hibernate1.cfg.xml");
		Session session =sessionFactory.openSession();
		
		session.beginTransaction();
		
		CollegeDetails cd = new CollegeDetails();
		cd.setCollegeContact("+170344556");
		cd.setCollegeLocation("Reston");
		cd.setCollegeStrength(300);
		
		
		College college = new College();
		college.setCollegeName("Arizona College");
		college.setCollegeDetails(cd);
		
		session.save(college);
		
		session.getTransaction().commit();
		
		System.out.println("Saved College... ");
		
		
	}
}
