package com.lataeviaberry.stirsuggestions;

import android.content.Intent;
import android.sax.TextElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {
    private TextView mSongTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        mSongTextView = (TextView) findViewById(R.id.songTextView);
        Intent intent = getIntent();
        String song = intent.getStringExtra("song");
        mSongTextView.setText("Here are all the songs similar to " + song + ":");
    }
}
