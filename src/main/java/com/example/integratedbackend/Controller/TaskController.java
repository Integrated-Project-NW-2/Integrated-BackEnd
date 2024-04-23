package com.example.integratedbackend.Controller;

import com.example.integratedbackend.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/tasks")
public class TaskController {
    @Autowired
    TaskService service;

    @GetMapping("")
    public ResponseEntity<Object> getTasks(){
        return ResponseEntity.ok(service.getTasks());
    }
}
