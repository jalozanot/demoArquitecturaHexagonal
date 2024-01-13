package com.demo.hexagonal.infrastructure.entities;

import com.demo.hexagonal.domain.model.Task;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@Entity
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDateTime creationDate;
    private boolean completed;

    public static TaskEntity fromDomainModel(Task task) {
        return new TaskEntity(task.getId(), task.getTitle(), task.getDescription(), task.getCreationDate(), task.isCompleted());
    }

    public Task toDomainModel() {
        return new Task(id, title, description, creationDate, completed);
    }
}
