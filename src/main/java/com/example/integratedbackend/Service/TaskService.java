package com.example.integratedbackend.Service;

import com.example.integratedbackend.Entities.Tasks;
import com.example.integratedbackend.Repositories.TasksRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    TasksRepositories repositories;

    public List<Tasks> getTasks() {
        return repositories.findAll();
    }
}