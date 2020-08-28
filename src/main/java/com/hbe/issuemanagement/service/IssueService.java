package com.hbe.issuemanagement.service;

import com.hbe.issuemanagement.dto.IssueDto;
import com.hbe.issuemanagement.entity.Issue;
import com.hbe.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface  IssueService {

    IssueDto save(IssueDto issue);
    IssueDto getById(Long id);
    TPage<IssueDto> getAllPageable(Pageable pageable);
    Boolean delete (IssueDto issue);


}
