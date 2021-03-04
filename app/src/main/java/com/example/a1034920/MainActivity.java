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
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(
                new AudioAttributes.Builder()
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .build()
        );
        mediaPlayer.setDataSource(getApplicationContext(), myUri);
        mediaPlayer.prepare();
        mediaPlayer.start();
        String url = "http://........"; // your URL here
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(
                new AudioAttributes.Builder()
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .build()
        );
        mediaPlayer.setDataSource(url);
        mediaPlayer.prepare(); // might take long! (for buffering, etc)
        mediaPlayer.start();
        mediaPlayer.release();
        mediaPlayer = null;

        public class MyService extends Service implements MediaPlayer.OnPreparedListener {
            private static final String ACTION_PLAY = "com.example.action.PLAY";
            MediaPlayer mediaPlayer = null;

            public int onStartCommand(Intent intent, int flags, int startId) {
        ...
                if (intent.getAction().equals(ACTION_PLAY)) {
                    mediaPlayer = ... // initialize it here
                    mediaPlayer.setOnPreparedListener(this);
                    mediaPlayer.prepareAsync(); // prepare async to not block main thread
                }
            }

            /** Called when MediaPlayer is ready */
            public void onPrepared(MediaPlayer player) {
                player.start();
            }
        }
        /**Using wake locks*/
        mediaPlayer = new MediaPlayer();
// ... other initialization here ...
        mediaPlayer.setWakeMode(getApplicationContext(), PowerManager.PARTIAL_WAKE_LOCK);
        WifiLock wifiLock = ((WifiManager) getSystemService(Context.WIFI_SERVICE))
                .createWifiLock(WifiManager.WIFI_MODE_FULL, "mylock");

        wifiLock.acquire();
        wifiLock.release();
        public class MyService extends Service {
            MediaPlayer mediaPlayer;
            // ...

            @Override
            public void onDestroy() {
                super.onDestroy();
                if (mediaPlayer != null) mediaPlayer.release();
            }
        }
        setDataSource();
        setOnDrmConfigHelper(); // optional, for custom configuration
        prepare();
        if (getDrmInfo() != null) {
            prepareDrm();
            getKeyRequest();
            provideKeyResponse();
        }

// MediaPlayer is now ready to use
        start();
// ...play/pause/resume...
        stop();
        releaseDrm();

        setOnPreparedListener();
        setOnDrmInfoListener();
        setDataSource();
        prepareAsync();
// ...

// If the data source content is protected you receive a call to the onDrmInfo() callback.
        onDrmInfo() {
            prepareDrm();
            getKeyRequest();
            provideKeyResponse();
        }

// When prepareAsync() finishes, you receive a call to the onPrepared() callback.
// If there is a DRM, onDrmInfo() sets it up before executing this callback,
// so you can start the player.
        onPrepared() {

            start();
        }
        ContentResolver contentResolver = getContentResolver();
        Uri uri = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        Cursor cursor = contentResolver.query(uri, null, null, null, null);
        if (cursor == null) {
            // query failed, handle error.
        } else if (!cursor.moveToFirst()) {
            // no media on the device
        } else {
            int titleColumn = cursor.getColumnIndex(android.provider.MediaStore.Audio.Media.TITLE);
            int idColumn = cursor.getColumnIndex(android.provider.MediaStore.Audio.Media._ID);
            do {
                long thisId = cursor.getLong(idColumn);
                String thisTitle = cursor.getString(titleColumn);
                // ...process entry...
            } while (cursor.moveToNext());
        }
        long id = /* retrieve it from somewhere */;
        Uri contentUri = ContentUris.withAppendedId(
                android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, id);

        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(
                new AudioAttributes.Builder()
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .build()
        );
        mediaPlayer.setDataSource(getApplicationContext(), contentUri);

// ...prepare and start...
    }

}