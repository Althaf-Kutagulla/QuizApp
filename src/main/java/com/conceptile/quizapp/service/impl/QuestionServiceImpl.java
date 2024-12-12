package com.conceptile.quizapp.service.impl;

import com.conceptile.quizapp.entity.Question;
import com.conceptile.quizapp.repository.QuestionRepository;
import com.conceptile.quizapp.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Question getQuestionById(Integer id) {
        return questionRepository.findById(id).get();
    }
}
