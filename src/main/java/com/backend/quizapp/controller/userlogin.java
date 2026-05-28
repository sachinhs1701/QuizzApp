package com.backend.quizapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class userlogin {
	@GetMapping("/login")
public String login()
{
return "user";	
}
}
