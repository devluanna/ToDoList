package br.com.lua.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String description;

    @Column(length = 50)
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;

    @CreationTimestamp
    private LocalDateTime createdAt;

    private UUID idUser;
}
