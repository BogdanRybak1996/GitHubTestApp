package ua.ck.test.github.githubtestproject.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import ua.ck.test.github.githubtestproject.data.Repository;
import ua.ck.test.github.githubtestproject.data.User;

public interface GitHubService {
    @GET("users/{userName}")
    Call<User> userByLogin(@Path("userName") String userName);
    @GET("users/{userName}/repos")
    Call<List<Repository>> userRepos(@Path("userName") String userName);
}
