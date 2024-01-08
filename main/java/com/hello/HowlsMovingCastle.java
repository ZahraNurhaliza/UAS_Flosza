package com.hello;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class HowlsMovingCastle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_howlsmovingcastle);

        VideoView videoView = findViewById(R.id.fantasy2);

        // Menggunakan Uri untuk mengonversi path video ke bentuk yang sesuai
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.fantasy2;
        Uri uri = Uri.parse(videoPath);

        // Set URI video ke VideoView
        videoView.setVideoURI(uri);

        // Membuat dan mengaitkan MediaController untuk memungkinkan kontrol video
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        // Memulai pemutaran video
        videoView.start();
    }


}

