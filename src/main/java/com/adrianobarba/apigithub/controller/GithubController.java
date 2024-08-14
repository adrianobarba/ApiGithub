package com.adrianobarba.apigithub.controller;


import com.adrianobarba.apigithub.client.GithubClient;
import com.adrianobarba.apigithub.repository.RepositoryResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/v1")
public class GithubController {

    private GithubClient githubClient;

    public GithubController(GithubClient githubClient) {
        this.githubClient = githubClient;
    }

    @GetMapping("/repos")
    public ResponseEntity<List<RepositoryResponse>> listRepos(){

        var repos = GithubClient.listRepos(
                "",
                "null",
                "public"

          );
        return ResponseEntity.ok(repos);
    }
}
