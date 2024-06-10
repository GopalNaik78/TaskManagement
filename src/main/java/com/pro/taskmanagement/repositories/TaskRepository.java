package com.pro.taskmanagement.repositories;

import com.pro.taskmanagement.Entitys.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
