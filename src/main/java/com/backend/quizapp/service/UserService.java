package com.backend.quizapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backend.quizapp.Repository.Quizzrepo;
import com.backend.quizapp.Repository.UserRepo;
import com.backend.quizapp.controller.userlogin;
import com.backend.quizapp.model.Question;
import com.backend.quizapp.model.UserTable;

@Service
public class UserService { 
Quizzrepo repository;
 UserRepo urepository;

public UserService(Quizzrepo repository, UserRepo urepository) {
	super();
	this.repository = repository;
	this.urepository = urepository;
}

public void createuser(UserTable u1)
{
	urepository.save(u1);
}

public List<Question> quizzbycatogery(String cat)
{
 return repository.findByCatagory(cat);	
}

}
