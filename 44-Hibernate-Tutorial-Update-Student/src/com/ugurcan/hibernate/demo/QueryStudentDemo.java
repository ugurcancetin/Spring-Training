package com.ugurcan.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ugurcan.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {

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
			Student tempStudent = new Student("Ali", "VELI", "aveli@liferay.com");
			
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("Saving the student...");
			System.out.println( tempStudent );
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();

			System.out.println("Student saved succesfully!");
			System.out.println( "--------------------------------------------------------" );
			System.out.println( "Generated Id for this student = " + tempStudent.getId() );
			System.out.println( "--------------------------------------------------------" );
			//now get a new sessiong and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();

			//retrieve the student back based on studentId
			System.out.println( " ...Getting student with id " +tempStudent.getId() );
			Student myStudent = session.get( Student.class, tempStudent.getId() );
			System.out.println( "--------------------------------------------------------" );

			System.out.println( "Student Informations : " + myStudent );

			//commit the Transaction
			session.getTransaction().commit();
			System.out.println( "--------------------------------------------------------" );
			System.out.println( "SUCCESSFUL" );
		} finally {
			factory.close();
		}
	}

}
