package com.demo.hexagonal.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AdditionalTaskInfo {

    private final Long userId;
    private final String userName;
    private final String userEmail;
}
