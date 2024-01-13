package com.demo.hexagonal.domain.ports.in.task;

import com.demo.hexagonal.domain.model.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
    Optional<Task> getTaskById(Long id);
    List<Task> getAllTasks();
}
