package com.example.myvideoview;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    //create class reference
    VideoView vid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vid = (VideoView)findViewById(R.id.videoView);
    }
    public void playVideo(View v) {
        MediaController m = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            m = new MediaController(this);
            vid.setMediaController(m);
        }

        String path = "android.resource://com.example.myvideoview/"+R.raw.r_expert_lingo;

        Uri u = Uri.parse(path);

        vid.setVideoURI(u);

        vid.start();

    }
}
