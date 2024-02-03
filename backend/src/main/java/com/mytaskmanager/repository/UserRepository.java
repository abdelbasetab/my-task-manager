package com.mytaskmanager.repository;


import com.mytaskmanager.pojo.Task;
import com.mytaskmanager.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {


    User findByEmail(String email);

}
