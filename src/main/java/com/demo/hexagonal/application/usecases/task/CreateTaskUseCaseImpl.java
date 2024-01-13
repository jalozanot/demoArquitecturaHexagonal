package com.demo.hexagonal.application.usecases.task;

import com.demo.hexagonal.domain.model.Task;
import com.demo.hexagonal.domain.ports.in.task.CreateTaskUseCase;
import com.demo.hexagonal.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@AllArgsConstructor
public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
