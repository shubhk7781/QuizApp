package com.quizApp.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizApp.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
