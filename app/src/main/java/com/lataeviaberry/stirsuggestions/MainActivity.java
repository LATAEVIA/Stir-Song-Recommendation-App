package com.lataeviaberry.stirsuggestions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mFindSongsButton;
    private EditText mSongEditText;
    private TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSongEditText = (EditText) findViewById(R.id.songEditText);
        mFindSongsButton = (Button) findViewById(R.id.findSongsButton);
        mAppNameTextView = (TextView) findViewById(R.id.appNameTextView);

        mFindSongsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String song = mSongEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, SongsActivity.class);
                intent.putExtra("song", song);
                startActivity(intent);
            }
        });
    }
}