package com.example.a1034920;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.sound_file_1);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you
        Uri myUri = ....; // initialize Uri here
        private static final String VIDEO_SAMPLE = "tacoma_narrows";
        private VideoView mVideoView;
        private Uri getMedia(String mediaName) {
        return Uri.parse("android.resource://" + getPackageName() + 
        "/raw/" + mediaName);
            private void initializePlayer() {

}
}

// ...prepare and start...
    }

}
