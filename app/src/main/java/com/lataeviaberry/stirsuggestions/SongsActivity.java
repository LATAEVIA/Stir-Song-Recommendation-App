package com.lataeviaberry.stirsuggestions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SongsActivity extends AppCompatActivity {
    @Bind(R.id.songTextView)
    TextView mSongTextView;
    @Bind(R.id.listView)
    ListView mListView;
    private String[] songs = new String[] {"Song1", "Song2",
            "Song3", "Song4", "Song5", "Song6",
            "Song7", "Song8", "Song9", "Song10",
            "Song11", "Song12", "Song13", "Song14", "Song15"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        ButterKnife.bind(this);

        mListView = (ListView) findViewById(R.id.listView);
        mSongTextView = (TextView) findViewById(R.id.songTextView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, songs);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String song = ((TextView)view).getText().toString();
                Toast.makeText(SongsActivity.this, song, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SongsActivity.this, PlaybackActivity.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        String song = intent.getStringExtra("song");
        mSongTextView.setText("Here are all the songs similar to " + song + ":");
    }
}