package com.ugurcan.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ugurcan.hibernate.demo.entity.Student;

public class PrimaryKeyDemo
{

	public static void main( String[] args )
	{

		//create sessiong factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
	//create session
		Session session = factory.getCurrentSession();
		
		try {
			//create Student object
			System.out.println("Creating new student object...");
			Student tempStudent = new Student("Elena", "LENA", "elena@liferay.com");
			Student tempStudent1 = new Student("Ali", "KORKMAZ", "ali.korkmaz@liferay.com");
			Student tempStudent2 = new Student("Jack", "TYSON", "tyson@liferay.com");
			
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("Saving the student...");
			session.save(tempStudent);
			session.save(tempStudent1);
			session.save(tempStudent2);
			
			//commit transaction
			session.getTransaction().commit();
			
			
			System.out.println("Student saved succesfully!");
			
		} finally {
			factory.close();
		}
	}

}
