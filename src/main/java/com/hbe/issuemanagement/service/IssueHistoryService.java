package com.hbe.issuemanagement.service;

import com.hbe.issuemanagement.entity.Issue;
import com.hbe.issuemanagement.entity.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.hbe.issuemanagement.dto.IssueHistoryDto;
import com.hbe.issuemanagement.util.TPage;


public interface IssueHistoryService {

    IssueHistoryDto save(IssueHistoryDto issueHistory);
    IssueHistoryDto getById(Long id);
    TPage<IssueHistoryDto> getAllPageable(Pageable pageable);
    Boolean delete(IssueHistoryDto issueHistory);

}
