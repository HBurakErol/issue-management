package com.hbe.issuemanagement.service.impl;


import com.hbe.issuemanagement.entity.Project;
import com.hbe.issuemanagement.repository.ProjectRepository;
import com.hbe.issuemanagement.service.ProjectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl  implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository=projectRepository;
    }

    @Override
    public Project save(Project project) {
        //Bussiness Logic
        if(project.getProjectCode()==null){
            throw  new IllegalArgumentException("Project Code cannot be null!! ");
        }
        project=projectRepository.save(project);
        return project;
    }

    @Override
    public Project getById(Long id) {
        return projectRepository.getOne(id);
    }

    @Override
    public Boolean delete(Project project) {
        return null;
    }

    @Override
    public List<Project> getByProjectCodeContains(String projectCode) {
        return null;
    }

    @Override
    public List<Project> getByProjectCode(String projectCode) {
        return null;
    }

    @Override
    public Page<Project> getAllPageable(Pageable pageable) {
        return null;
    }
}
