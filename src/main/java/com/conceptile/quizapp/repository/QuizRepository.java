package com.conceptile.quizapp.repository;

import com.conceptile.quizapp.entity.QuizSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface QuizRepository extends JpaRepository<QuizSession, UUID> {
}
