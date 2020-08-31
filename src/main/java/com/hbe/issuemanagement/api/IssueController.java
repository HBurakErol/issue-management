package com.hbe.issuemanagement.api;



import com.hbe.issuemanagement.dto.IssueDto;
import com.hbe.issuemanagement.service.impl.IssueServiceImpl;
import com.hbe.issuemanagement.util.ApiPaths;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(ApiPaths.IssueCtrl.CTRL)
public class IssueController {
    private IssueServiceImpl issueServiceImpl;

    public IssueController(IssueServiceImpl issueServiceImpl){
        this.issueServiceImpl=issueServiceImpl;
    }


    @GetMapping("/{id}")
    public ResponseEntity<IssueDto> getById(@PathVariable(value = "id",required = true) Long id){
        IssueDto issueDto = issueServiceImpl.getById(id);
        return ResponseEntity.ok(issueDto);
    }

    @PostMapping
    public ResponseEntity<IssueDto> createProject(@RequestBody IssueDto issue){

        return ResponseEntity.ok(issueServiceImpl.save(issue));
    }

    //@RequestMapping(path = "/update", method = RequestMethod.PUT)
    @PutMapping("/{id}")
    public ResponseEntity<IssueDto> updateProject(@PathVariable(value = "id", required = true) Long id  ,
                                                    @RequestBody IssueDto issue)
    {

       return ResponseEntity.ok(issueServiceImpl.update(id,issue));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id){

        return ResponseEntity.ok(issueServiceImpl.delete(id));
    }







}
















