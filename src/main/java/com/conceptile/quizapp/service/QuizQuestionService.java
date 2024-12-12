package com.conceptile.quizapp.service;

import com.conceptile.quizapp.entity.QuizQuestion;

import java.util.List;
import java.util.UUID;

public interface QuizQuestionService {

    void createQuestions(UUID quizSessionId);

    List<QuizQuestion> getAllQuizQUestionsByQuizSessionId(UUID quizSessionId);

    Boolean attemptQuizQuestion(Long quizQueId,String answer);
}
