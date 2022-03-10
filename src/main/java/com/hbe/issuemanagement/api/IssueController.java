package com.hbe.issuemanagement.api;



import com.hbe.issuemanagement.dto.IssueDto;
import com.hbe.issuemanagement.dto.ProjectDto;
import com.hbe.issuemanagement.service.impl.IssueServiceImpl;
import com.hbe.issuemanagement.util.ApiPaths;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(ApiPaths.IssueCtrl.CTRL)
@Api(value = "ApiPaths.IssueCtrl.CTRL",description = "Issue APIs")
public class IssueController {
    private IssueServiceImpl issueServiceImpl;

    public IssueController(IssueServiceImpl issueServiceImpl){
        this.issueServiceImpl=issueServiceImpl;
    }


    @GetMapping("/{id}")
    @ApiOperation(value = "Get By Id Operation", response = IssueDto.class)
    public ResponseEntity<IssueDto> getById(@PathVariable(value = "id",required = true) Long id){
        IssueDto issueDto = issueServiceImpl.getById(id);
        return ResponseEntity.ok(issueDto);
    }

    @PostMapping
    @ApiOperation(value = "Create Operation", response = IssueDto.class)
    public ResponseEntity<IssueDto> createProject(@RequestBody IssueDto issue){

        return ResponseEntity.ok(issueServiceImpl.save(issue));
    }

    //@RequestMapping(path = "/update", method = RequestMethod.PUT)
    @PutMapping("/{id}")
    @ApiOperation(value = "Update Operation", response = IssueDto.class)
    public ResponseEntity<IssueDto> updateProject(@PathVariable(value = "id", required = true) Long id  ,
                                                    @RequestBody IssueDto issue)
    {

       return ResponseEntity.ok(issueServiceImpl.update(id,issue));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete Operation", response = Boolean.class)
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id){

        return ResponseEntity.ok(issueServiceImpl.delete(id));
    }







}
















