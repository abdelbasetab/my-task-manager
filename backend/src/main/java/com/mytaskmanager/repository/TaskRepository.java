package com.mytaskmanager.repository;

import com.mytaskmanager.pojo.Task;
import com.mytaskmanager.pojo.User;

import java.util.List;

public interface TaskRepository {

    List<Task> findByUser(User user);

}
