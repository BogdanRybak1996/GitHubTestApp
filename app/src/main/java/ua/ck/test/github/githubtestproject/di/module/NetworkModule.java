package ua.ck.test.github.githubtestproject.di.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ua.ck.test.github.githubtestproject.R;
import ua.ck.test.github.githubtestproject.network.GitHubService;

@Module
public class NetworkModule {
    @Provides
    @Singleton
    GitHubService provideGitHubService(Context context){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(context.getString(R.string.github_base_url))
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(GitHubService.class);
    }
}
