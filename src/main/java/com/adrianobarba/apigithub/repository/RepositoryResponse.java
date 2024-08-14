package com.adrianobarba.apigithub.repository;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RepositoryResponse(String id,
                                 @JsonProperty("htmlUrl") String htmlUrl,
                                 @JsonProperty("private") boolean isPrivate) {
}
