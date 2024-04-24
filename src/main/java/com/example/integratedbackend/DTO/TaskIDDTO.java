package com.example.integratedbackend.DTO;

import com.example.integratedbackend.Entities.ResourceType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class TaskIDDTO {
    private String Title;
    private String Assignees;
    private String Description;
    private ResourceType Status;
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssXXX")
    private Timestamp createdOn;
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssXXX")
    private Timestamp updatedOn;
}
