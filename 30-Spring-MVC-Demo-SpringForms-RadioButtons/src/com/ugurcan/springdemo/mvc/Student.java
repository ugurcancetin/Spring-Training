package com.ugurcan.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favLang;
	
	private LinkedHashMap<String, String> countryOptions;
	
	
	
	public Student(){
		//populate Country Options : used ISO country code
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("TR" , "Turkey");
		countryOptions.put("HU" , "Hungary");
		countryOptions.put("ES" , "Spain");
		countryOptions.put("IT" , "Italy");
		countryOptions.put("US" , "United States of America");
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

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
		this.lastName = lastName;
	}

	public String getFavLang() {
		return favLang;
	}

	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}
	
	
}
