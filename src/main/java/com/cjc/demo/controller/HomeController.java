package com.cjc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.demo.model.Student;
import com.cjc.demo.service.ServiceI;

@Controller
public class HomeController {
	@Autowired(required = true)
	ServiceI sr;

	@RequestMapping("/")
	public String openindex() {
		System.out.println("index page");
		return "index";
	}

	@RequestMapping("/login")
	public String openlogin() {
		return "login";
	}

	@RequestMapping("/register")
	public String openregister() {
		return "register";
	}

	@RequestMapping("/reg")
	public String addStudentdata(@ModelAttribute Student student) {

		sr.addStudentdata(student);

		return "login";
	}
}
