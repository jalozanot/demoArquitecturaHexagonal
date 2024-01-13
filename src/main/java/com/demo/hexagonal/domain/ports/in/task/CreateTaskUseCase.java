package com.demo.hexagonal.domain.ports.in.task;

import com.demo.hexagonal.domain.model.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);

}
