package com.demo.hexagonal.domain.ports.out;

import com.demo.hexagonal.domain.model.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
