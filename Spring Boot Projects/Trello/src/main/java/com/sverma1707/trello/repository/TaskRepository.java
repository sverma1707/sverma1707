package com.sverma1707.trello.repository;

import com.sverma1707.trello.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
