package com.pradeep.springjenkinsgit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringJenkinsGitController {

    @GetMapping("/get")
    public String get() {
        return "Hello to my community... ";
    }
}
