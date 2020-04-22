package org.mula.finance.activities.article;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.mula.finance.Models.Article;
import org.mula.finance.R;

import java.util.ArrayList;


public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.RestaurantViewHolder> {
    private ArrayList<Article> mArticles;
    private RecyclerViewClickListener mListener;
    private static final String TAG = " 3 ARTICLE ADAPTER ";

    public ArticleAdapter(ArrayList<Article> articles, RecyclerViewClickListener listener) {
        mArticles = articles;
        mListener = listener;
    }


    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }

    public static class RestaurantViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView articleTitle, articleSnippet;
        public ImageView articleImage;
        private RecyclerViewClickListener mListener;

        public RestaurantViewHolder(View v, RecyclerViewClickListener listener) {
            super(v);
            mListener = listener;
            v.setOnClickListener(this);
            articleTitle = v.findViewById(R.id.article_title);
            articleSnippet = v.findViewById(R.id.article_snippet);
            articleImage = v.findViewById(R.id.article_image);
        }

        @Override
        public void onClick(View view) {
            mListener.onClick(view, getAdapterPosition());
        }
    }

    @Override
    public ArticleAdapter.RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.article_list_row, parent, false);
        return new RestaurantViewHolder(v, mListener);
    }


    //Replace the contents of a view (invoked by the layout manager
    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position){
        Article article = mArticles.get(position);
        holder.articleTitle.setText(article.getArticleTitle());
        holder.articleSnippet.setText(article.getArticleSnippet());
        holder.articleImage.setImageResource(article.getImageID());
    }
    //Return the size of our dataset
    @Override
    public int getItemCount() {
        return mArticles.size();
    }
}


