package com.backend.quizapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.backend.quizapp.model.Question;
import com.backend.quizapp.service.QuestionService;

@RestController
@RequestMapping("/api")
public class QuestionController {

	
	private QuestionService service;
	@GetMapping("/Questions")
	public List<Question> getallquestion()
	{
		return service.getallQuestion();
	}
	public QuestionController(QuestionService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/add")
	public String addquestion(@RequestBody Question q1)
	{
		System.out.println(q1+"controller" );
		if(service.Addquestion(q1)==true)
		{
			return "sucessful";
		}
		return "unsucessful";
		
	}
	
}
