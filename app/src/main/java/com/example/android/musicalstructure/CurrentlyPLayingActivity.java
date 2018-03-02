package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CurrentlyPLayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currently_playing);

        getSupportActionBar().setTitle("Currently playing");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView currentArtistView = (TextView)findViewById(R.id.currentArtist);
        currentArtistView.setText(getIntent().getStringExtra("current_artist"));

        TextView currentTitleView = (TextView)findViewById(R.id.currentTitle);
        currentTitleView.setText(getIntent().getStringExtra("current_title"));
    }
}
