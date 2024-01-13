package com.demo.hexagonal.domain.ports.in.task;

import com.demo.hexagonal.domain.model.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id, Task updatedTask);

}
