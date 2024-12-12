package com.conceptile.quizapp.controllers;


import com.conceptile.quizapp.entity.QuizQuestion;
import com.conceptile.quizapp.entity.QuizSession;
import com.conceptile.quizapp.service.QuizQuestionService;
import com.conceptile.quizapp.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/quiz")
@RequiredArgsConstructor
public class QuizController {

    private final QuizService quizService;
    private final QuizQuestionService quizQuestionService;

    @PostMapping("/create-quiz-session")
    public ResponseEntity<UUID> createQuizSession(@RequestBody Integer userId){
      UUID quizSessionId =  quizService.createQuizSession(userId);
      quizQuestionService.createQuestions(quizSessionId);
      return ResponseEntity.ok(quizSessionId);
    }

    @GetMapping("/get-quiz-session/{quizSessionId}")
    public ResponseEntity<QuizSession> getQuizSession(@PathVariable("quizSessionId") UUID quizSessionId){
        QuizSession quizSession = quizService.getQuizSessionById(quizSessionId);
        return ResponseEntity.ok(quizSession);
    }
}
