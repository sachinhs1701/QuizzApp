package com.backend.quizapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.quizapp.model.UserTable;

public interface UserRepo extends JpaRepository<UserTable,Long>{

}
