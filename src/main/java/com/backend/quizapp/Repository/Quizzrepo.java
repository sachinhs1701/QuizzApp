package com.backend.quizapp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.quizapp.model.Question;

public interface Quizzrepo extends JpaRepository<Question,Long> {
public List<Question> findByCatagory(String cat);
}
