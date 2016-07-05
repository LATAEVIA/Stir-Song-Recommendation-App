package com.lataeviaberry.stirsuggestions;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.findSongsButton)
    Button mFindSongsButton;
    @Bind(R.id.songEditText)
    EditText mSongEditText;
    @Bind(R.id.appNameTextView)
    TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Typeface indieFlowerFont = Typeface.createFromAsset(getAssets(), "fonts/IndieFlower.ttf");
        mAppNameTextView.setTypeface(indieFlowerFont);

        mFindSongsButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v == mFindSongsButton) {
            String song = mSongEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, SongsActivity.class);
            intent.putExtra("song", song);
            startActivity(intent);

        }
    }
}