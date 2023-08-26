package com.example.gitrepoaadi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubApiService {
    @GET("repos/{owner}/{repo}")
    Call<Repository> getRepository(
            @Path("owner") String owner,
            @Path("repo") String repoName
    );
}