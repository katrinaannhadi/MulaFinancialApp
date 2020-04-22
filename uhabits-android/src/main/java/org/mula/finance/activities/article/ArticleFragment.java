package org.mula.finance.activities.article;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import org.mula.finance.R;

public class ArticleFragment extends Fragment {

    private Article mArticle;

    public ArticleFragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_article, container, false);
        int position = 0;


        //Initialising views
        TextView articleTitle = v.findViewById(R.id.article_title);
        TextView articleCategory = v.findViewById(R.id.article_category);
        TextView articleFull = v.findViewById(R.id.article_full);
        ImageView image = v.findViewById(R.id.imageView);
        ImageView search = v.findViewById(R.id.ivSearch);

        Intent intent = getActivity().getIntent();
        position = intent.getIntExtra(ArticleActivity.EXTRA_MESSAGE,0);
        mArticle = Article.getSavingsList().get(position);

        articleTitle.setText(mArticle.getArticleTitle());
        articleCategory.setText(mArticle.getArticleCategory());
        articleFull.setText(String.valueOf(mArticle.getArticleFull()));
        image.setImageResource(mArticle.getImageID());
        search.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                searchRestaurant(mArticle.getArticleTitle(), mArticle.getArticleSnippet());

            }

        });
        return v;
    }
    private void searchRestaurant(String name, String location){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=" + name + " " + location));
        startActivity(intent);
        
    }
    private void setImage(String url, final View view){

    }
}
