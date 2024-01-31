package com.mytaskmanager.repository;


import com.mytaskmanager.pojo.User;


public interface UserRepository {
    User findByUsername(String username);
}
