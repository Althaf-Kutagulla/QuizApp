package com.conceptile.quizapp.service.impl;

import com.conceptile.quizapp.entity.QuizSession;
import com.conceptile.quizapp.entity.User;
import com.conceptile.quizapp.repository.QuizRepository;
import com.conceptile.quizapp.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {

    private final QuizRepository quizRepository;
    @Override
    public UUID createQuizSession(Integer userId) {
       QuizSession savedQuizSession = quizRepository.save(QuizSession.builder()
                        .user(User.builder()
                                .id(userId)
                                .build())
                       .score(0)
                       .totalScore(10)
                .build());
       return savedQuizSession.getId();
    }

    @Override
    public QuizSession getQuizSessionById(UUID quizSessionId) {
        return quizRepository.findById(quizSessionId).get();
    }
}
