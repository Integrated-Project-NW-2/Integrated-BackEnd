package com.example.integratedbackend.Service;

import com.example.integratedbackend.Entities.Tasks;
import com.example.integratedbackend.Repositories.TasksRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    TasksRepositories repositories;

    public List<Tasks> getTasks() {
        return repositories.findAll();
    }
    public Tasks findByID(Integer id){
        return repositories.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "task number" + id +"doesn't exist!!!!!!"));
    }

}
