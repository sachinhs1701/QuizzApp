package com.backend.quizapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.quizapp.model.Question;

public interface Quizzrepo extends JpaRepository<Question,Long> {

}
