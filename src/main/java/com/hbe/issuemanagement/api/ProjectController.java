package com.hbe.issuemanagement.api;


import com.hbe.issuemanagement.dto.ProjectDto;
import com.hbe.issuemanagement.service.impl.ProjectServiceImpl;
import com.hbe.issuemanagement.util.ApiPaths;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(ApiPaths.ProjectCtrl.CTRL)
@Api(value = "ApiPaths.ProjectCtrl.CTRL",description = "Project APIs")
public class ProjectController {
    private ProjectServiceImpl projectServiceImpl;

    public ProjectController(ProjectServiceImpl projectServiceImpl){
        this.projectServiceImpl=projectServiceImpl;
    }


    @GetMapping("/{id}")
    @ApiOperation(value = "Get By Id Operation", response = ProjectDto.class)
    public ResponseEntity<ProjectDto> getById(@PathVariable(value = "id",required = true) Long id){
        ProjectDto projectDto = projectServiceImpl.getById(id);
        return ResponseEntity.ok(projectDto);
    }

    @PostMapping
    @ApiOperation(value = "Create Operation", response = ProjectDto.class)
    public ResponseEntity<ProjectDto> createProject(@RequestBody ProjectDto project){

        return ResponseEntity.ok(projectServiceImpl.save(project));
    }

    //@RequestMapping(path = "/update", method = RequestMethod.PUT)
    @PutMapping("/{id}")
    @ApiOperation(value = "Update Operation", response = ProjectDto.class)
    public ResponseEntity<ProjectDto> updateProject(@PathVariable(value = "id", required = true) Long id  ,
                                                    @RequestBody ProjectDto project)
    {

       return ResponseEntity.ok(projectServiceImpl.update(id,project));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete Operation", response = Boolean.class)
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id){

        return ResponseEntity.ok(projectServiceImpl.delete(id));
    }







}
















