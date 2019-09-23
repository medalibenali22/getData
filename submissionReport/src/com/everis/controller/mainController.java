package com.everis.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.everis.domain.Submission;
import com.everis.domain.readFromExcel;


@Controller
public class mainController {
	
	 String SAMPLE_XLSX_FILE_PATH = "C:\\Users\\albenali\\git\\getData\\submissionReport\\resources\\testExcel.xlsx";
	
	
	@GetMapping("/")
	@PostMapping("/")
	public ModelAndView homePage(HttpServletRequest request) {
		
		ModelAndView model = new ModelAndView();
		
		List<Submission> ls  = readFromExcel.getSubmissionsFromExcel(SAMPLE_XLSX_FILE_PATH);
		model.addObject("submissions", ls);
		model.setViewName("viewer");
		return model;
	}
	


}
