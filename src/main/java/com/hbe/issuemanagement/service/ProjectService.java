package com.hbe.issuemanagement.service;

import com.hbe.issuemanagement.entity.Project;
import com.hbe.issuemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ProjectService {

    Project save(Project Project);
    Project getById(Long id);
    Boolean delete(Project project);
    List<Project> getByProjectCodeContains(String projectCode);
    List<Project> getByProjectCode(String projectCode);
    Page<Project> getAllPageable(Pageable pageable);



}








