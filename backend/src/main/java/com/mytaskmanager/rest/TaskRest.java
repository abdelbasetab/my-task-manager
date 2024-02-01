package com.mytaskmanager.rest;

import com.mytaskmanager.pojo.Task;
import org.springframework.web.bind.annotation.PathVariable;

import java.net.http.HttpResponse;

public interface TaskRest {




    public HttpResponse<String> addTask(Task task, Long userId);

    public HttpResponse<String> deleteTask(@PathVariable Long taskId,@PathVariable  Long userId);


    public HttpResponse<Task> getTasksByUser(@PathVariable Long userId);



}
