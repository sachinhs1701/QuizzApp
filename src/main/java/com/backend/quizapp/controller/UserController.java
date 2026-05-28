package com.backend.quizapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.backend.quizapp.model.Question;
import com.backend.quizapp.model.UserTable;
import com.backend.quizapp.service.UserService;
@Controller
@RequestMapping("/inn")
public class UserController {

    UserService user;

    public UserController(UserService user) {
        this.user = user;
    }

    @PostMapping("/start")
    @ResponseBody
    public String startQuizz(@RequestBody UserTable u1)
    {
        user.createuser(u1);
   System.out.println(u1.getCatagory()+" start");
   return "/inn/quizform?cat=" + u1.getCatagory();
    }

    @GetMapping("/quizform")
    public String quizForm()
    {
        return "quizform";
    }

    @ResponseBody
    @GetMapping("/quizz/{cat}")
    public List<Question> getQuestionbycat(@PathVariable String cat)
    { System.out.println(cat+" quizz");
        return user.quizzbycatogery(cat);
    }
}