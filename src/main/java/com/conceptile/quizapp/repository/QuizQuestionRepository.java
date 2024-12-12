package com.conceptile.quizapp.repository;

import com.conceptile.quizapp.entity.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface QuizQuestionRepository extends JpaRepository<QuizQuestion, Long> {
    List<QuizQuestion> findAllByQuizSessionId(UUID quizSessionId);
}
