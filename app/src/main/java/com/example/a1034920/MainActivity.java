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
        private static final String VIDEO_SAMPLE = "tacoma_narrows";
        private VideoView mVideoView;
        private Uri getMedia(String mediaName) {
            return Uri.parse("android.resource://" + getPackageName() +
                    "/raw/" + mediaName);
            private Uri getMedia(String mediaName) {
                return Uri.parse("android.resource://" + getPackageName() + "/raw/" + mediaName);
                mvideoView = findViewById(R.id.videoview);
                private void initializePlayer() {
                    Uri videoUri = getMedia(VIDEO_SAMPLE);
                    mVideoView.setVideoURI(videoUri);
                    mVideoView.start();
                    private void releasePlayer() {
                        mVideoView.stopPlayback();
                        @Override
                        protected  void onStop() {
                            super.onStart();
                            initializePlayer();
                        }
                        @Override
                        protected void onStop() {
                            super.onStop();

                            releasePlayer();
                        }
                        @Override
                        protected void onPause() {
                            super.onPause();

                            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
                                mVideoView.pause();
                            }
                        }
                        MediaController controller = new MediaController(this);
                        controller.setMediaPlayer(mVideoView);
                        mVideoView.setMediaController(controller);
                        private int mCurrentPosition = 0;
                        private static final String PLAYBACK_TIME = "play_time";
                        if (mCurrentPosition > 0) {
                            mVideoView.seekTo(mCurrentPosition);
                        } else {
                            // Skipping to 1 shows the first frame of the video.
                            mVideoView.seekTo(1);
                        }
                        @Override
                        protected void onSaveInstanceState(Bundle outState) {
                            super.onSaveInstanceState(outState);

                            outState.putInt(PLAYBACK_TIME, mVideoView.getCurrentPosition());
                        }
                        if (savedInstanceState != null) {
                            mCurrentPosition = savedInstanceState.getInt(PLAYBACK_TIME);
                        }
                        mVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                // Implementation here.
                            }
                        });
                    }
                }
            }
        }
    }


}
