package com.mytaskmanager.restController;

import com.mytaskmanager.pojo.Task;
import com.mytaskmanager.rest.TaskRest;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class TaskController implements TaskRest {



    public List<Task> getTasksByUser(@PathVariable Long userId) {
//        User user = userRepository.findById(userId).orElse(null);
//        if (user != null) {
//            return taskRepository.findByUser(user);
//        }
        return null; // todo custome Notfound Exception
    }

}
