package com.conceptile.quizapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name ="quiz_session")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class QuizSession {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    private Integer score;

    private Integer totalScore;

}
