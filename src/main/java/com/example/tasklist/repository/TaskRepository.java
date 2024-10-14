package com.example.tasklist.repository;

import com.example.tasklist.domain.task.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {


    Optional<Task> findByID(Long id);

    List<Task> findAllByUserId(Long userID);

    void assignToUserById(Long TaskId, Long userID);

    void update(Task task);

    void create(Task task);

    void delete(Long id);

}
