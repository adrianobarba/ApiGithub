package com.adrianobarba.apigithub.controller;


import com.adrianobarba.apigithub.repository.RepositoryResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/v1")
public class GithubController {

    @GetMapping("/repos")
    public ResponseEntity<List<RepositoryResponse>> listRepos(){
        return null;
    }
}
