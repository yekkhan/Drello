package com.example.drello.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String boardName;

    @ManyToOne
    @JoinColumn(name="userId", nullable=false)
    private User user;

    @CreationTimestamp
    private Timestamp updatedAt;

    @UpdateTimestamp
    private Timestamp createdAt;

    @OneToMany(mappedBy="id")
    Collection<Task> tasks = new ArrayList<>();
}
