package org.mula.finance.activities.video;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

import org.mula.finance.Adapters.VideoAdapter;
import org.mula.finance.Models.Video;
import org.mula.finance.R;

import java.util.ArrayList;

public class VideoActivity extends AppCompatActivity {

    static final String GOOGLE_API_KEY = "AIzaSyBGLD7OOCSXgfn5E1nKG2NNBj7XfJ28Rkc";
    static final String YOUTUBE_VIDEO_ID = "gnWj97CEjeo";
    static final String YOUTUBE_PLAYLIST_2 = "PLECECA66C0CE68B1E";
    static final String YOUTUBE_PLAYLIST = "PL9ECA8AEB409B3E4F";
    static final String YOUTUBE_PLAYLIST_3 = "PLEAWiihj06OL80BfkpXVh2AQ";

    private View view;
    private RecyclerView rv;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Video> mVideos;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video2);

        rv = findViewById(R.id.rv_video);
        rv.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(mLayoutManager);

//        Button btnPlayVideo = (Button) findViewById(R.id.buttonVideo);
//        Button btnPlaylist = (Button) findViewById(R.id.buttonPlaylist);
//        Button btnPlaylist2 = (Button) findViewById(R.id.buttonInvestopedia);
//
//        //Passing to the setOnClickListener method and object that passes the OnClickListener
//        //Interface that's called when the button is tapped
//
//
//
//        btnPlayVideo.setOnClickListener(this);
//        btnPlaylist.setOnClickListener(this);
//        btnPlaylist2.setOnClickListener(this);

        mVideos = new ArrayList<>();

        mVideos.add(0, new Video(1, "Khan Academy","playlist name",R.drawable.ic_learn3, new Intent(YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_PLAYLIST_2, 0, 0,true, true))));
        mVideos.add(1, new Video(2, "Khan Academy","playlist name",R.drawable.ic_learn3, new Intent(YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_PLAYLIST, 0, 0, true, true))));
        mVideos.add(2, new Video(3, "Khan Academy","playlist name",R.drawable.ic_learn3, new Intent(YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_PLAYLIST_3, 0, 0, true, true))));

//        calc.add(0, new IntentLink("Credit", new Intent(this, QuizActivity.class), R.drawable.image_credit, Color.YELLOW));
//        calc.add(1, new IntentLink("Investment", new Intent(this, QuizActivity.class), R.drawable.image_investment, Color.YELLOW));
//        calc.add(2, new IntentLink("Savings", new Intent(this, QuizActivity.class), R.drawable.image_savings, Color.YELLOW));


        VideoAdapter videoAdapter = new VideoAdapter(mVideos);

        rv = findViewById(R.id.rv_video);
        rv.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(mLayoutManager);

//        VideoAdapter.RecyclerViewClickListener listener = new VideoAdapter.RecyclerViewClickListener() {
//            @Override
//            public void onClick(View view, int position) {
//                startYouTubePlayer(position);
//
//            }
//        };

        rv.setAdapter(videoAdapter);
    }
}

//    private void startYouTubePlayer(int position) {
//        Intent intent = null;
//
//        //Utilising YoutubeStandalonePlayer
//        switch (position) {
//            case R.id.rv_video:
//                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_PLAYLIST_2, 0, 0,true, true);
//                break;
//
//            case R.id.buttonPlaylist:
//                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_PLAYLIST, 0, 0, true, true);
//                break;
//
//            case R.id.buttonInvestopedia:
//                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_PLAYLIST_3, 0, 0, true, true);
//                break;
//
//            default:
//
//        }
//
//        if (intent != null) {
//            startActivity(intent);
//        }



//    @Override
//    public void onClick(View view) {
//        Intent intent = null;
//
//        //Utilising YoutubeStandalonePlayer
//        switch (view.getId()) {
//            case R.id.buttonVideo:
//                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_PLAYLIST_2, 0, 0,true, true);
//                break;
//
//            case R.id.buttonPlaylist:
//                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_PLAYLIST, 0, 0, true, true);
//                break;
//
//            case R.id.buttonInvestopedia:
//                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_PLAYLIST_3, 0, 0, true, true);
//                break;
//
//            default:
//
//        }
//
//        if (intent != null) {
//            startActivity(intent);
//        }
//
//
//    }
//}

////TODO GET RID OF THIS
//
//
//package org.mula.finance.activities;
//
//        import androidx.annotation.RequiresApi;
//        import androidx.appcompat.app.AppCompatActivity;
//        import androidx.recyclerview.widget.LinearLayoutManager;
//        import androidx.recyclerview.widget.RecyclerView;
//
//        import android.content.Context;
//        import android.content.Intent;
//        import android.graphics.Color;
//        import android.os.Build;
//        import android.os.Bundle;
//        import android.view.View;
//        import android.widget.TextView;
//
//        import org.mula.finance.Adapters.CalculatorAdapter;
//        import org.mula.finance.AsyncTasks.ScoreAsyncTaskDelegate;
//        import org.mula.finance.AsyncTasks.ScoreListAsyncTaskDelegate;
//        import org.mula.finance.AsyncTasks.ScoreRetrieveAsyncTask;
//        import org.mula.finance.Databases.ScoreDatabase;
//        import org.mula.finance.Models.IntentLink;
//        import org.mula.finance.Models.Score;
//        import org.mula.finance.R;
//
//        import java.util.ArrayList;
//        import java.util.List;
//
//public class QuizStartActivity extends AppCompatActivity implements ScoreAsyncTaskDelegate, ScoreListAsyncTaskDelegate {
//
//    private View view;
//    private RecyclerView rv;
//    private ArrayList<IntentLink> calc;
//    private TextView titleAverage;
//    private TextView titleTopCategory;
//    private TextView textAverage;
//    private TextView textTopCategory;
//    private ArrayList<IntentLink> categoryList;
//    private ScoreDatabase db;
//    private RecyclerView.Adapter mAdapter;
//    private RecyclerView.LayoutManager mLayoutManager;
//
//
//
//    @RequiresApi(api = Build.VERSION_CODES.CUPCAKE)
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_quiz_start);
//
//
//
//        titleAverage = findViewById(R.id.text_quiz_average);
//        titleTopCategory = findViewById(R.id.text_high_score);
//        textAverage = findViewById(R.id.text_score);
//        textTopCategory = findViewById(R.id.text_percentage);
//        titleAverage.setText("Top Score:");
//        titleTopCategory.setText("Top Category:");
//
//        calc = new ArrayList<>();
//
//        calc.add(0, new IntentLink("Credit", new Intent(this, QuizActivity.class), R.drawable.image_credit, Color.YELLOW));
//        calc.add(1, new IntentLink("Investment", new Intent(this, QuizActivity.class), R.drawable.image_investment, Color.YELLOW));
//        calc.add(2, new IntentLink("Savings", new Intent(this, QuizActivity.class), R.drawable.image_savings, Color.YELLOW));
//
//        CalculatorAdapter calcAdapter = new CalculatorAdapter(calc);
//
//        rv = findViewById(R.id.rv_quiz);
//        rv.setHasFixedSize(true);
//        mLayoutManager = new LinearLayoutManager(this);
//        rv.setLayoutManager(mLayoutManager);
//
//        rv.setAdapter(calcAdapter);
//        db = db.getInstance(this);
//
//        retrieveScoreListFromDb();
//
//
//
//
//    }
//    @Override
//    public void handleScoreReturned(List<Score> scores){
//        int num = 0;
//    }
//
//    @Override
//    public void handleScoreListReturned(List<Score> scores){
//        try{
//
//            int topCategory = 0;
//            int highScore = 0;
//
//            for(int i = 0; i < scores.size(); i++){
//                if(highScore < scores.get(i).getScore()){
//                    topCategory = scores.get(i).getCategory();
//                    highScore = scores.get(i).getScore();
//                }
//            }
//
//
//            try {
//                textAverage.setText(Integer.toString(highScore));
//            } catch (ArithmeticException e){
//                textAverage.setText(0);
//            }
//
//            switch (topCategory){
//                case 1:
//                    textTopCategory.setText("Credit");
//                    break;
//                case 2:
//                    textTopCategory.setText("Investment");
//                    break;
//                case 3:
//                    textTopCategory.setText("Tax");
//                    break;
//                default:
//                    textTopCategory.setText("N/A");
//                    break;
//            }
//
//        }catch(NullPointerException e) {
//
//        }
//
//    }
//
//    @RequiresApi(api = Build.VERSION_CODES.CUPCAKE)
//    public void retrieveScoreListFromDb(){
//        ScoreRetrieveAsyncTask retrieveAsyncTask = new ScoreRetrieveAsyncTask();
//        retrieveAsyncTask.setScoreDatabase(db);
//        retrieveAsyncTask.setDelegate(this);
//        retrieveAsyncTask.execute();
//    }
//
//    private void startQuiz(int number){
//        Context c = view.getContext();
//        Intent intent = new Intent(c, QuizActivity.class);
//        intent.putExtra("Difficulty", number);
//        c.startActivity(intent);
//    }
//}

