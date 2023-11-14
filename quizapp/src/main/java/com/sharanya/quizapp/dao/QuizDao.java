package com.sharanya.quizapp.dao;

import com.sharanya.quizapp.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
