package com.example.drello.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

import java.sql.Timestamp;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name="boardId", nullable=false)
    private Board board;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    private Timestamp deadline;

    @CreationTimestamp
    private Timestamp updatedAt;

    @UpdateTimestamp
    private Timestamp createdAt;
}
