package com.conceptile.quizapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "choices")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Question question;
    private String choice;
}
