package com.quizApp.quizservice.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.quizApp.quizservice.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
