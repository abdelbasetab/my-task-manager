package com.mytaskmanager.restController;

import com.mytaskmanager.pojo.User;
import com.mytaskmanager.rest.UserRest;
import com.mytaskmanager.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserRest {


    @Autowired
    private UserServiceImpl userService;


    @Override
    public String submit() {
        return "Hallo Wolrd ";
    }

    //Todo all exceptions and custome the responce
    @Override
    public ResponseEntity getUserById(Long id) {
        return new ResponseEntity<>(userService.getUserById(id),HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity insert(User user) {
        return new ResponseEntity<>( userService.addUser(user), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity delete(Long id) {


        return new ResponseEntity<>( userService.delete(id), HttpStatus.CREATED);
    }
}
