package com.conceptile.quizapp.repository;

import com.conceptile.quizapp.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
