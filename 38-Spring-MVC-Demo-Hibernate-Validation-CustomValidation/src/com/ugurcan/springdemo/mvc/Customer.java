package com.ugurcan.springdemo.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ugurcan.spring.demo.mvc.validation.CourseCode;

public class Customer {

	private String firstName;
	
	@NotNull(message="Required")
	@Size(min=4,max=25 , message="must be between 4 - 25 characters")
	private String lastName;
	
	@CourseCode
	private String courseCode;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		System.out.println("| "+ lastName + " |");
		this.lastName = lastName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
}
