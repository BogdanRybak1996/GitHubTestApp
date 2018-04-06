package ua.ck.test.github.githubtestproject.ui.reposList;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import ua.ck.test.github.githubtestproject.R;

public class ReposActivity extends AppCompatActivity {

    ReposViewModel viewModel;

    @BindView(R.id.repos_activity_recycler)
    RecyclerView reposRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repos);

        viewModel = ViewModelProviders.of(this).get(ReposViewModel.class);

        ButterKnife.bind(this);
    }
}
