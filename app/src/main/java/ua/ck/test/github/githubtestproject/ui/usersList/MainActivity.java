package ua.ck.test.github.githubtestproject.ui.usersList;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import ua.ck.test.github.githubtestproject.R;

public class MainActivity extends AppCompatActivity {

    MainActivityViewModel viewModel;

    @BindView(R.id.main_activity_users_recycler_view)
    RecyclerView usersRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);

        ButterKnife.bind(this);

    }
}
