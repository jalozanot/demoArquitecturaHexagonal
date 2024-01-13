package com.demo.hexagonal.domain.ports.in.task;

public interface DeleteTaskUserCase {
    boolean deleteTask(Long id);
}
