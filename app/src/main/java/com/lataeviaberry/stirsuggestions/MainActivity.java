package com.lataeviaberry.stirsuggestions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mFindSongsButton;
    private EditText mSongEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSongEditText = (EditText) findViewById(R.id.songEditText);
        mFindSongsButton = (Button) findViewById(R.id.findSongsButton);
        mFindSongsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String song = mSongEditText.getText().toString();
                Log.d(TAG, song);
                Intent intent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(intent);
            }
        });
    }
}