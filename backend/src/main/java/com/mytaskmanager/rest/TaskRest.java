package com.mytaskmanager.rest;

import com.mytaskmanager.pojo.Task;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface TaskRest {




    public String addTask(Task task, Long userId);

    public String deleteTask(Long taskId, Long userId);


    public List<Task> getTasksByUser(@PathVariable Long userId);



}
