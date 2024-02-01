package com.mytaskmanager.rest;




import com.mytaskmanager.pojo.User;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserRest {



    public User getUserById(@PathVariable Long id);

    public String LogIn(User user);


    
}
