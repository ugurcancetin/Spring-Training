package com.ugurcan.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ugurcan.hibernate.demo.entity.Student;

public class UpdateStudentDemo{

	public static void main(String[] args) {

	//create sessiong factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();

	//create session
		Session session = factory.getCurrentSession();
		
		try {

			int studentId=1;
			
			session = factory.getCurrentSession();
			session.beginTransaction();

			System.out.println( "Getting the student with id : " + studentId );
			System.out.println( "--------------------------------------------------------" );

			Student myStudent = session.get( Student.class, studentId );
			System.out.println( "Updating student : " + myStudent );
			System.out.println( "--------------------------------------------------------" );

			System.out.println( "Updating the  area " + myStudent.getFirstName() );
			System.out.println( "Updating the  area " + myStudent.getEmail() );
			System.out.println( "Updating...." );
			System.out.println( "--------------------------------------------------------" );

			myStudent.setFirstName( "Micheal" );
			myStudent.setEmail( "micheal@liferay.com" );
			System.out.println( "Update areas " + myStudent.getFirstName() );
			System.out.println( "Update areas " + myStudent.getEmail() );
			System.out.println( "Successfuly Updated!!!" );

			System.out.println( "--------------------------------------------------------" );
			session.getTransaction().commit();
			System.out.println( "Successful" );
			System.out.println( "--------------------------------------------------------" );

			System.out.println( "Updating the all students email adresses..." );
			for( int i = 1; i < 9; i++ )
			{
				session = factory.getCurrentSession();
				session.beginTransaction();
				myStudent = session.get( Student.class, i );
				myStudent.setEmail( myStudent.getFirstName() + "@liferay.com" );
				session.getTransaction().commit();
			}
			System.out.println( "--------------------------------------------------------" );
			System.out.println( "Successfuly Updated!!!" );
			System.out.println( myStudent );
			
		} finally {
			factory.close();
		}
	}

}
