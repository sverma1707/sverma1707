package com.sverma1707.trello.controller;

import com.sverma1707.trello.entity.Task;
import com.sverma1707.trello.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping(value = "/")
    List<Task> getAll() {
        return taskService.getAllTask();
    }
}
