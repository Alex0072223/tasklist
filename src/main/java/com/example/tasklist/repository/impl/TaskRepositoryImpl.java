package com.example.tasklist.repository.impl;

import com.example.tasklist.domain.task.Task;
import com.example.tasklist.repository.TaskRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository // Аннотация спринга, которя позволяет создать с помощью Autowired объект
public class TaskRepositoryImpl implements TaskRepository {
    @Override
    public Optional<Task> findByID(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Task> findAllByUserId(Long userID) {
        return null;
    }

    @Override
    public void assignToUserById(Long TaskId, Long userID) {

    }

    @Override
    public void update(Task task) {

    }

    @Override
    public void create(Task task) {

    }

    @Override
    public void delete(Long id) {

    }

}
