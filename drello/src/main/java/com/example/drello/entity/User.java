package com.example.drello.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String last_name;

    private String first_name;

    private String username;

    private String password;

    @CreationTimestamp
    private Timestamp createdAt;

    @OneToMany(mappedBy="id")
    private Collection<Board> boards = new ArrayList<>();
}
