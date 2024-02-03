package com.mytaskmanager.pojo;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @NotBlank
    private String password;

    @Email
    @NotBlank
    private String email;

//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    private List<Task> tasks = new ArrayList<>();


}
