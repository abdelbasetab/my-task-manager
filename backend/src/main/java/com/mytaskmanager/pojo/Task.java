package com.mytaskmanager.pojo;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Entity
//@Table(name = "tasks")
//@Data
//@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long id;

    @NotBlank
    private String title;

    private String description;


//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;


}
