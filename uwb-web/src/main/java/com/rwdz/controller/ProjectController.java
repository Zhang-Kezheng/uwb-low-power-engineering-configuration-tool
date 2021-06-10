package com.rwdz.controller;

import com.rwdz.context.ProjectContext;
import com.rwdz.service.ProjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 章可政
 * @date 2021/6/10 23:46
 */
@RestController
@RequestMapping(UrlMapping.PROJECT)
public class ProjectController {

    private ProjectService projectService;

    @GetMapping
    public List<ProjectContext> getProjectList(){
        return projectService.getProjectList();
    }
}
