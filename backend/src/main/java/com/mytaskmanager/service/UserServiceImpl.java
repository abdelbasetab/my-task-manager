package com.mytaskmanager.service;

import com.mytaskmanager.exception.UserNotFoundException;
import com.mytaskmanager.pojo.User;
import com.mytaskmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User getUserById(Long id) {

        if(userRepository.existsById(id)){

            return userRepository.findById(id).get();

        }
        else
            throw new UserNotFoundException("no such user id "+id);

    }



    //todo check if user already exists

    public User addUser(User user) {

        return userRepository.save(user) ;

    }

    public String delete(Long id) {

        if(userRepository.existsById(id)){

            User user=  userRepository.findById(id).get();

            userRepository.delete(user);
            return "user deleted";

        }
        else
            throw new UserNotFoundException("no such user id = "+id);

    }
}
