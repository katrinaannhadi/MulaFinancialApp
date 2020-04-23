package org.mula.finance.activities.video;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

import org.mula.finance.R;

public class VideoActivity extends AppCompatActivity implements View.OnClickListener {

    static final String GOOGLE_API_KEY = "AIzaSyBGLD7OOCSXgfn5E1nKG2NNBj7XfJ28Rkc";
    static final String YOUTUBE_VIDEO_ID = "gnWj97CEjeo";
    static final String YOUTUBE_PLAYLIST_2 = "PLECECA66C0CE68B1E";
    static final String YOUTUBE_PLAYLIST = "PL9ECA8AEB409B3E4F";
    static final String YOUTUBE_PLAYLIST_3 = "PLEAWiihj06OL80BfkpXVh2AQ";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        Button btnPlayVideo = (Button) findViewById(R.id.buttonVideo);
        Button btnPlaylist = (Button) findViewById(R.id.buttonPlaylist);
        Button btnPlaylist2 = (Button) findViewById(R.id.buttonInvestopedia);

        //Passing to the setOnClickListener method and object that passes the OnClickListener
        //Interface that's called when the button is tapped

        btnPlayVideo.setOnClickListener(this);
        btnPlaylist.setOnClickListener(this);
        btnPlaylist2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = null;

        //Utilising YoutubeStandalonePlayer
        switch (view.getId()) {
            case R.id.buttonVideo:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_PLAYLIST_2, 0, 0,true, true);
                break;

            case R.id.buttonPlaylist:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_PLAYLIST, 0, 0, true, true);
                break;

            case R.id.buttonInvestopedia:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubePlayerActivity.GOOGLE_API_KEY, YoutubePlayerActivity.YOUTUBE_PLAYLIST_3, 0, 0, true, true);
                break;

            default:

        }

        if (intent != null) {
            startActivity(intent);
        }


    }
}