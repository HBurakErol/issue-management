package com.hbe.issuemanagement.dto;

import com.hbe.issuemanagement.entity.IssueStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Issue Data Transfer Object")
public class IssueDto {
    @ApiModelProperty(value = "ID")
    private Long id;
    @ApiModelProperty(required = true, value = "Description")
    private String description;
    @ApiModelProperty(required = true, value = "Issue Details")
    private String details;
    @ApiModelProperty(required = true, value = "Date")
    private Date date;
    @ApiModelProperty(required = true, value = "Issue Status")
    private IssueStatus issueStatus;
    @ApiModelProperty(required = true, value = "Assignee")
    private UserDto assignee;
    @ApiModelProperty(required = true, value = "Project")
    private ProjectDto project;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public IssueStatus getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(IssueStatus issueStatus) {
        this.issueStatus = issueStatus;
    }

    public UserDto getAssignee() {
        return assignee;
    }

    public void setAssignee(UserDto assignee) {
        this.assignee = assignee;
    }

    public ProjectDto getProject() {
        return project;
    }

    public void setProject(ProjectDto project) {
        this.project = project;
    }

}
