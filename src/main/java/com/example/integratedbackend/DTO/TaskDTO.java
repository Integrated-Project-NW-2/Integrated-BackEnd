package com.example.integratedbackend.DTO;

import com.example.integratedbackend.Entities.ResourceType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDTO {
    private String Title;
    private String Assignees;
    private ResourceType Status;
}
