
package com.ugurcan.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer
{

	private String firstName;

	@NotNull( message = "Required" )
	@Size( min = 4, max = 25, message = "must be between 4 - 25 characters" )
	private String lastName;

	@Min( value = 1, message = "Minumum 1 passing" )
	@Max( value = 5, message = "Maximum 5 passes" )
	private int freePasses;

	@Pattern(regexp="^[a-zA-z0-9]{5}", message="Not Valid Postal Code")
	private String postalCode;
	
	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName( String firstName )
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName( String lastName )
	{
		System.out.println( "| " + lastName + " |" );
		this.lastName = lastName;
	}

	public int getFreePasses()
	{
		return freePasses;
	}

	public void setFreePasses( int freePasses )
	{
		this.freePasses = freePasses;
	}

	
	public String getPostalCode()
	{
		return postalCode;
	}

	
	public void setPostalCode( String postalCode )
	{
		this.postalCode = postalCode;
	}

	
}
