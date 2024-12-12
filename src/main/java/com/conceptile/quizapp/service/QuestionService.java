package com.conceptile.quizapp.service;

import com.conceptile.quizapp.entity.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getAllQuestions();

    Question getQuestionById(Integer id);
}
