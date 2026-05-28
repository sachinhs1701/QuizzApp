package com.backend.quizapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backend.quizapp.Repository.Quizzrepo;
import com.backend.quizapp.model.Question;

@Service
public class QuestionService {

	private Quizzrepo quizz1;
	
	public QuestionService(Quizzrepo quizz1) {
		super();
		this.quizz1 = quizz1;
	}

	public List<Question> getallQuestion()
	{
		List<Question> q1=quizz1.findAll();
		System.out.println(q1.size());
		return q1;
	}
	
	public boolean Addquestion(Question q1)
	{
	    System.out.println(q1+"service");
		quizz1.save(q1);
		return true; 
	}
	public boolean deletequestion(long id)
	{
	
		quizz1.deleteById(id);
		return true;
		}
}
