package com.hbe.issuemanagement.service.impl;

import com.hbe.issuemanagement.dto.IssueDto;
import com.hbe.issuemanagement.entity.Issue;
import com.hbe.issuemanagement.repository.IssueRepository;
import com.hbe.issuemanagement.service.IssueService;
import com.hbe.issuemanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepository issueRepository, ModelMapper modelMapper){
        this.issueRepository=issueRepository;
        this.modelMapper=modelMapper;
    }


    @Override
    public IssueDto save(IssueDto issue) {
        //Bussiness Logic
        if(issue.getDate()==null){
            throw new IllegalArgumentException("Issue date cannot be null");
        }
        else {
            Issue issueEntity = modelMapper.map(issue, Issue.class);
            issueEntity=issueRepository.save(issueEntity);
            issue.setId(issueEntity.getId());
            return issue;
            //return modelMapper.map(issueDb,IssueDto.class);
        }

    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {

        Page<Issue> data=issueRepository.findAll(pageable);
        TPage page=new TPage<IssueDto>();
        IssueDto[] dtos= modelMapper.map(data.getContent(),IssueDto[].class);
        page.setStat(data, Arrays.asList(dtos));
        return page;
    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }
}








