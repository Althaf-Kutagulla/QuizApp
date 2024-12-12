package com.conceptile.quizapp.service;

import com.conceptile.quizapp.entity.QuizSession;

import java.util.UUID;

public interface QuizService {
    UUID createQuizSession(Integer userId);

    QuizSession getQuizSessionById(UUID quizSessionId);
}
