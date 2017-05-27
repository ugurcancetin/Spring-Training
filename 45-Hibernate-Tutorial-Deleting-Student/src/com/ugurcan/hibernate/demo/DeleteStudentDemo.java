package com.ugurcan.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ugurcan.hibernate.demo.entity.Student;

public class DeleteStudentDemo{

	public static void main(String[] args) {

	//create sessiong factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();

	//create session
		Session session = factory.getCurrentSession();
		
		try {
			int studentId=8;

			session = factory.getCurrentSession();
			session.beginTransaction();

			System.out.println( "Getting the student with id : " + studentId );
			System.out.println( "--------------------------------------------------------" );

			Student myStudent = session.get( Student.class, studentId );
			System.out.println( "Deleting the student with "  + studentId);
			session.delete( myStudent );

			System.out.println( "--------------------------------------------------------" );
			session.getTransaction().commit();
			System.out.println( "Successful!!!" );
			
		} finally {
			factory.close();
		}
	}

}
