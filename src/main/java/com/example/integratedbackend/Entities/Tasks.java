package com.example.integratedbackend.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "task", schema = "kradanitbangmod")
@Getter
@Setter
public class Tasks {
    @Id
    @Column(name = "taskId")
    private Integer taskId;
    
    @Column(name = "taskTitle")
    private String taskTitle;
    
    @Column(name = "taskDescription")
    private String taskDescription;
    
    @Column(name = "taskAssignees")
    private String taskAssignees;

    @Enumerated(EnumType.STRING)
    @Column(name = "taskStatus")
    private ResourceType taskStatus;
    
    @Column(name = "createdOn")
    private Timestamp createdOn;
    
    @Column(name = "updatedOn")
    private Timestamp updatedOn;

    
}
