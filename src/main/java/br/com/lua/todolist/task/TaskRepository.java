package br.com.lua.todolist.task;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;

public interface TaskRepository extends JpaRepository<TaskModel, UUID> {
    
}
