package com.demo.hexagonal.application.usecases.task;

import com.demo.hexagonal.domain.model.AdditionalTaskInfo;
import com.demo.hexagonal.domain.ports.in.task.GetAdditionalTaskInfoUseCase;
import com.demo.hexagonal.domain.ports.out.ExternalServicePort;
import com.demo.hexagonal.domain.ports.out.TaskRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {

    private final ExternalServicePort externalServicePort;

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long taskId) {
        return externalServicePort.getAdditionalTaskInfo(taskId);
    }
}
