package com.intoonpocket.backend.domain.work.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class WorkAllResponseDto {
    private Long id;
    private String workName;
    private String authorName;
    private String workUrl;
    private String instargramId;
    private String imageUrl;
    private Long count;
    private List<String> workSubjectList;
    private List<String> workCategoryList;

}
