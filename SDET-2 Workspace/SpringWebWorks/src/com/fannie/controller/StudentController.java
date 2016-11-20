package com.fannie.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fannie.beans.Student;

@Controller
public class StudentController {

	@RequestMapping(value = "/student.html", method = RequestMethod.GET)
	public ModelAndView student() {
			// this will call student.jsp in WEB-INF

		return new ModelAndView("student", "command", new Student());
	}

	@RequestMapping(value = "/addStudent.html", method = RequestMethod.POST)
	public String addStudent(Student student, ModelMap model) {
		
		
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());
		
		// will call result.jsp in WEB-INF
		return "result";
	}
}

