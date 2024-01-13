package com.demo.hexagonal.domain.ports.in.task;

import com.demo.hexagonal.domain.model.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);

}
