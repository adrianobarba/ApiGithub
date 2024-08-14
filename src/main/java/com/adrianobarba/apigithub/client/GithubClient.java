package com.adrianobarba.apigithub.client;

import com.adrianobarba.apigithub.repository.RepositoryResponse;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface GithubClient {

    @GetExchange("/user/repos")
    public List<RepositoryResponse> listRepos();

}
