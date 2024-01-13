package com.demo.hexagonal.application.usecases.task;

import com.demo.hexagonal.domain.ports.in.task.DeleteTaskUserCase;
import com.demo.hexagonal.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DeleteTaskUserCaseImpl implements DeleteTaskUserCase {

    private final TaskRepositoryPort taskRepositoryPort;
    @Override
    public boolean deleteTask(Long id) {
        return taskRepositoryPort.deleteById(id);
    }
}
