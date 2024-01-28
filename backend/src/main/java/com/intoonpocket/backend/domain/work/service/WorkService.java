package com.intoonpocket.backend.domain.work.service;

import com.intoonpocket.backend.domain.work.dto.WorkAllResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface WorkService {
    Page<WorkAllResponseDto> findAllWork(Pageable pageable);
}
