package com.pradeep.springjenkinsgit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class SpringJenkinsGitController {

    @GetMapping("/get/{name}")
    public String get(@PathVariable("name") String name) {
        return "Hello to my community... " +name;
    }
}
