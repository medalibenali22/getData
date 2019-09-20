package com.everis.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.everis.domain.Submission;
import com.everis.domain.submissionManagementImpl;

@Controller
public class mainController {
	
	
	submissionManagementImpl submissionmanagment;
	
	@GetMapping("/")
	@PostMapping("/")
	public ModelAndView homePage(HttpServletRequest request) {
		
		ModelAndView model = new ModelAndView();
		List<Submission> ls  = submissionmanagment.getAllSubmissions();
			model.addObject("submissions", ls);
		model.setViewName("viewer");
		return model;
	}
	


}
