package com.example.drello.entity;

public enum TaskStatus {
    CREATED("CREATED", "Task is created"),
    EXPIRED("EXPIRED", "Task is expired"),
    DELETED("DELETED", "Task i deleted"),
    COMPLETED("COMPLETED", "Task is completed");

    private final String name;
    private final String description;

    TaskStatus(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
