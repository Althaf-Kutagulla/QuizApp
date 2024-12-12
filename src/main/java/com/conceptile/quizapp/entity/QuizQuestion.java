package com.conceptile.quizapp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "quiz_session_questions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuizQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(targetEntity = QuizSession.class)
    private QuizSession quizSession;

    @ManyToOne
    private Question question;

    private String submittedAnswer;

    private Boolean isCorrect;
}
