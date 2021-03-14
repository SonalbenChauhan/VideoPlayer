package com.example.videoplayerlab;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    //Reference Variable
    VideoView VideoPlayer;

    //mediacontroller we use for pause video and play video
    MediaController mediaController;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoPlayer = (VideoView) findViewById(R.id.videoViewID);
        //make object of media controller

        mediaController = new MediaController(this);

        //set path for video so it can grab the video to show

        VideoPlayer.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.sunset);

       // VideoPlayer.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.birthday);

        VideoPlayer.start();

        //set anchorview for our videoview for stability of video
        mediaController.setAnchorView(VideoPlayer);

        //map to videoview
        VideoPlayer.setMediaController(mediaController);
    }
}
