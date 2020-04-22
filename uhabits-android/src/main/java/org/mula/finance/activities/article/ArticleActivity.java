package org.mula.finance.activities.article;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.mula.finance.R;

public class ArticleActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.katrinaann.top10restaurants.MESSAGE";

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArticleAdapter.RecyclerViewClickListener listener = new ArticleAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                launchDetailActivity(position);
            }
        };
        mAdapter = new ArticleAdapter(Article.getSavingsList(), listener);
        mRecyclerView.setAdapter(mAdapter);
    }


    private void launchDetailActivity(int position) {
        Intent intent = new Intent(this, ArticleDetailActivity.class);
        intent.putExtra(EXTRA_MESSAGE, position);
        startActivity(intent);
    }
}

