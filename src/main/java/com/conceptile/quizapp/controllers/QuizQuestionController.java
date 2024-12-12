package com.conceptile.quizapp.controllers;


import com.conceptile.quizapp.entity.QuizQuestion;
import com.conceptile.quizapp.service.QuizQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("api/v1/quiz-question")
@RequiredArgsConstructor
public class QuizQuestionController {

    private final QuizQuestionService quizQuestionService;

    @GetMapping("/{quizSessionId}")
    public ResponseEntity<List<QuizQuestion>> getAllQuizQuestionsByQuizSessionId(@PathVariable("quizSessionId") UUID quizSessionId) {
        List<QuizQuestion>  quizQuestions =quizQuestionService.getAllQuizQUestionsByQuizSessionId(quizSessionId);
        return ResponseEntity.ok(quizQuestions);
    }

    @PutMapping("/attempt/{quizQueId}")
    public ResponseEntity<Boolean> attemptQuizQuestion(@PathVariable("quizQueId") Long quizQueId,@RequestBody  String answer) {
        Boolean attempt = quizQuestionService.attemptQuizQuestion(quizQueId,answer);
        return ResponseEntity.ok(attempt);
    }

}
