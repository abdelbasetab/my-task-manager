package com.mytaskmanager.restController;

import com.mytaskmanager.pojo.User;
import com.mytaskmanager.rest.UserRest;
import org.springframework.web.bind.annotation.PathVariable;

public class UserController implements UserRest {




    public User getUserById(@PathVariable Long id){

        return null;

    }

}
