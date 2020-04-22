package org.mula.finance.activities.article;

import android.os.Parcel;
import org.mula.finance.R;

import java.util.ArrayList;

//class for objects to classify restaurants
public class Article {

    //unique ID for Article object
    private int articleID;
    //name, type of cuisine, location, rating
    private String articleTitle;
    private String articleCategory;
    private int imageID;
    private String articleSnippet;
    private String articleFull;


    public Article() {
    }

    public Article(int articleID, String articleTitle, String articleCategory, int imageID, String articleSnippet, String articleFull) {
        this.articleID = articleID;
        this.articleTitle = articleTitle;
        this.articleCategory = articleCategory;
        this.imageID = imageID;
        this.articleSnippet = articleSnippet;
        this.articleFull = articleFull;
    }

    public Article(Parcel source) {
        articleID = source.readInt();
        articleTitle = source.readString();
        articleCategory = source.readString();
        imageID = source.readInt();
        articleSnippet = source.readString();
        articleFull = source.readString();

    }

    public int getArticleID() {
        return articleID;
    }

    public void setArticleID(int articleID) {
        this.articleID = articleID;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(String articleCategory) {
        this.articleCategory = articleCategory;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getArticleSnippet() {
        return articleSnippet;
    }

    public void setArticleSnippet(String articleSnippet) {
        this.articleSnippet = articleSnippet;
    }

    public String getArticleFull() {
        return articleFull;
    }

    public void setArticleFull(String articleFull) {
        this.articleFull = articleFull;
    }

    public static ArrayList<Article> getSavingsList() {
        ArrayList<Article> articles = new ArrayList<>();
        articles.add(new Article(0,"How to..", "Savings", R.drawable.ic_piggy_bank, "snippet", "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        articles.add(new Article(1,"How to..", "Savings", R.drawable.ic_piggy_bank, "snippet", "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        articles.add(new Article(2,"How to..", "Savings", R.drawable.ic_piggy_bank, "snippet", "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        articles.add(new Article(3,"How to..", "Savings", R.drawable.ic_piggy_bank, "snippet", "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        return articles;
    }

    public static ArrayList<Article> getRetirementList() {
        ArrayList<Article> articles = new ArrayList<>();
        articles.add(new Article(0,"How to", "Retirement", R.drawable.ic_super, "snippet", "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        articles.add(new Article(1,"How to", "Retirement", R.drawable.ic_super, "snippet", "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        articles.add(new Article(2,"How to", "Retirement", R.drawable.ic_super, "snippet", "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        articles.add(new Article(3,"How to", "Retirement", R.drawable.ic_super, "snippet", "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        return articles;
    }

    public static ArrayList<Article> getInvestmentList() {
        ArrayList<Article> articles = new ArrayList<>();
        articles.add(new Article(0,"Lankan Filling Station", "Investment", R.drawable.ic_investment_pink, "snippet", "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        articles.add(new Article(1,"Lankan Filling Station", "Investment", R.drawable.ic_investment_pink, "snippet", "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        articles.add(new Article(2,"Lankan Filling Station", "Investment", R.drawable.ic_investment_pink, "snippet", "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        articles.add(new Article(3,"Lankan Filling Station", "Investment", R.drawable.ic_investment_pink, "snippet", "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        return articles;
    }
    public static ArrayList<Article> getCreditCardList() {
        ArrayList<Article> articles = new ArrayList<>();
        articles.add(new Article(0,"Lankan Filling Station", "Credit Card", R.drawable.ic_credit_card, "snippet", "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        articles.add(new Article(1,"Lankan Filling Station", "Credit Card", R.drawable.ic_credit_card, "snippet", "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        articles.add(new Article(2,"Lankan Filling Station", "Credit Card", R.drawable.ic_credit_card, "snippet", "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        articles.add(new Article(3,"Lankan Filling Station", "Credit Card", R.drawable.ic_credit_card, "snippet", "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        return articles;
    }
}
