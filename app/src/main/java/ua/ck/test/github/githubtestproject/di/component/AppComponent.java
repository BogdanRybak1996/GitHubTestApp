package ua.ck.test.github.githubtestproject.di.component;

import javax.inject.Singleton;

import dagger.Component;
import ua.ck.test.github.githubtestproject.di.module.ApplicationModule;
import ua.ck.test.github.githubtestproject.di.module.NetworkModule;
import ua.ck.test.github.githubtestproject.network.GitHubService;

@Component(modules = {ApplicationModule.class,
        NetworkModule.class})
@Singleton
public interface AppComponent {
    GitHubService getGitHubService();
}
