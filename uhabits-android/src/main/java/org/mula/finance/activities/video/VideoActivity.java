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
        rv.setAdapter(videoAdapter);

//        VideoAdapter.RecyclerViewClickListener listener = new VideoAdapter.RecyclerViewClickListener() {
//            @Override
//            public void onClick(View view, int position) {
//                startYouTubePlayer(position);
//
//            }
//        };


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

