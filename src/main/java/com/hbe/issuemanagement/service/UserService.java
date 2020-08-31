package com.hbe.issuemanagement.service;

import com.hbe.issuemanagement.entity.Issue;
import com.hbe.issuemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.hbe.issuemanagement.dto.UserDto;
import com.hbe.issuemanagement.util.TPage;

public interface UserService {

    UserDto save(UserDto user);
    UserDto getById(Long id);
    TPage<UserDto> getAllPageable(Pageable pageable);
    UserDto getByUsername(String username);

}
