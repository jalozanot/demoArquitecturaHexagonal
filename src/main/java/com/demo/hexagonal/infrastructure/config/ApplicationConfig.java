package com.demo.hexagonal.infrastructure.config;

import com.demo.hexagonal.application.services.TaskService;
import com.demo.hexagonal.application.usecases.task.*;
import com.demo.hexagonal.domain.ports.in.task.GetAdditionalTaskInfoUseCase;
import com.demo.hexagonal.domain.ports.out.ExternalServicePort;
import com.demo.hexagonal.domain.ports.out.TaskRepositoryPort;
import com.demo.hexagonal.infrastructure.adapters.ExternalServiceAdapter;
import com.demo.hexagonal.infrastructure.repositories.JpaTaskRepositoryAdapter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.demo.hexagonal.*")
public class ApplicationConfig {

/*
 @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase) {
        return new TaskService(
                new CreateTaskUseCaseImpl(taskRepositoryPort),
                new RetrieveTaskUseCaseImpl(taskRepositoryPort),
                new UpdateTaskUseCaseImpl(taskRepositoryPort),
                new DeleteTaskUserCaseImpl(taskRepositoryPort),
                getAdditionalTaskInfoUseCase
        );
    }

    @Bean
    public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter) {
        return jpaTaskRepositoryAdapter;
    }

    @Bean
    public GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase(ExternalServicePort externalServicePort) {
        return new GetAdditionalTaskInfoUseCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort() {
        return new ExternalServiceAdapter();
    }*/
}
