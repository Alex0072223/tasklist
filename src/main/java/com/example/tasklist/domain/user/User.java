package com.example.tasklist.domain.user;

import lombok.Data;
import org.springframework.scheduling.config.Task;

import java.util.List;
import java.util.Set;

@Data //заменяет собой гетеры сетеры и toString()
public class User {

    private Long id;
    private String name;
    private String username;
    private String password;
    private String passwordConfirmation;
    private Set<Role> roles;
    private List<Task> tasks;

}
