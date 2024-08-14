package com.adrianobarba.apigithub.client;

import com.adrianobarba.apigithub.repository.RepositoryResponse;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface GithubClient {

    @GetExchange("/user/repos")
    public List<RepositoryResponse> listRepos(@RequestHeader("Authorization")String token,
                                              @RequestHeader(value = "X-GitHub-Api-Version", defaultValue = "2022-11-26")
                                              String apiVersion,
                                              @RequestParam("visibility")String visibility);

}
