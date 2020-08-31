package com.hbe.issuemanagement.service;

import com.hbe.issuemanagement.dto.ProjectDto;
import com.hbe.issuemanagement.entity.Project;
import com.hbe.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;
import com.hbe.issuemanagement.dto.ProjectDto;
import com.hbe.issuemanagement.util.TPage;

import java.util.List;


public interface ProjectService {


    ProjectDto save(ProjectDto project);
    ProjectDto getById(Long id);
    ProjectDto getByProjectCode(String projectCode);
    Boolean delete(ProjectDto project);
    List<ProjectDto> getByProjectCodeContains(String projectCode);

    TPage<ProjectDto> getAllPageable(Pageable pageable);



}








