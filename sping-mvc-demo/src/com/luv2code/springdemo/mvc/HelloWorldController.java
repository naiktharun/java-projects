package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("processFormVersionTwo")
	public String letShoutDude(HttpServletRequest request, Model model) {
	
		
		String theName = request.getParameter("studentName"); //get param from jsp
		
		
		theName = theName.toUpperCase(); //make it upper case
		
		String result = "yo " + theName;
		
		model.addAttribute("message", result); //send it back to jsp via model
		
		return "helloworld";
	}
	
	
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String theName, Model model) {
	
		
		//String theName = request.getParameter("studentName"); //spring will do it for us
		
		
		theName = theName.toUpperCase(); //make it upper case
		
		String result = "hey " + theName;
		
		model.addAttribute("message", result); //send it back to jsp via model
		
		return "helloworld";
	}
	
	
	

}
