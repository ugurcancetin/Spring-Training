package com.ugurcan.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	//need a controller method to show inital HTML form
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}
	
	//need a controller method to process HTML form
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}
	
	//new controller method to read form data and,
	//add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model){
		//read the request paramater from the HTML form
		String theName = request.getParameter("studentName");
		
		//convert the data uppercase
		theName = theName.toUpperCase();
		
		//create the message 
		String result = "WELCOME " + theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String theName, 
			Model model){
		
		//convert the data uppercase
		theName = theName.toUpperCase();
		
		//create the message 
		String result = "This Version Three " + theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
