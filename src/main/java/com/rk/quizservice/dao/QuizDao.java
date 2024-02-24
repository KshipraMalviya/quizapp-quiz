package com.rk.quizservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rk.quizservice.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
