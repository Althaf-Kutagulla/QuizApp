package com.conceptile.quizapp.service.impl;

import com.conceptile.quizapp.entity.Question;
import com.conceptile.quizapp.entity.QuizQuestion;
import com.conceptile.quizapp.entity.QuizSession;
import com.conceptile.quizapp.repository.QuizQuestionRepository;
import com.conceptile.quizapp.repository.QuizRepository;
import com.conceptile.quizapp.service.QuestionService;
import com.conceptile.quizapp.service.QuizQuestionService;
import com.conceptile.quizapp.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class QuizQuestionServiceImpl implements QuizQuestionService {

    private final QuestionService questionService;
    private final QuizService quizService;
    private final QuizQuestionRepository quizQuestionRepository;
    private final QuizRepository quizRepository;

    @Override
    public void createQuestions(UUID quizSessionId) {
        List<Question> allQuestions = questionService.getAllQuestions();

        allQuestions.forEach(question -> {
            QuizQuestion quizQuestion = QuizQuestion.builder()
                    .quizSession(QuizSession.builder().id(quizSessionId).build())
                    .question(question)
                    .build();
            quizQuestionRepository.save(quizQuestion);
        });
    }

    @Override
    public List<QuizQuestion> getAllQuizQUestionsByQuizSessionId(UUID quizSessionId) {
        List<QuizQuestion> quizQuestions = quizQuestionRepository.findAllByQuizSessionId(quizSessionId);
        return quizQuestions;
    }

    @Override
    public Boolean attemptQuizQuestion(Long quizQueId,String answer) {
        QuizQuestion quizQuestion = quizQuestionRepository.findById(quizQueId).get();

        quizQuestion.setSubmittedAnswer(answer);
        Question question = questionService.getQuestionById(quizQuestion.getQuestion().getId());
        // validation for submitted answer
        quizQuestion.setIsCorrect(question.getAnswer().equals(answer));
        if(question.getAnswer().equals(answer)) {
            QuizSession quizSession = quizService.getQuizSessionById(quizQuestion.getQuizSession().getId());
            quizSession.setScore(quizSession.getScore() + 1);
            quizRepository.save(quizSession);
        }
        quizQuestionRepository.save(quizQuestion);
        return true;
    }
}
