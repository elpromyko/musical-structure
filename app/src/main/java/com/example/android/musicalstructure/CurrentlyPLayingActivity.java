package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CurrentlyPLayingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currently_playing);

        getSupportActionBar().setTitle("Currently playing");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView currentArtistView = (TextView) findViewById(R.id.currentArtist);
        currentArtistView.setText(getIntent().getStringExtra("current_artist"));

        TextView currentTitleView = (TextView) findViewById(R.id.currentTitle);
        currentTitleView.setText(getIntent().getStringExtra("current_title"));

        final Button playButton = findViewById(R.id.playButton);
        Button stopButton = findViewById(R.id.stopButton);

        playButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (playButton.getBackground().getConstantState() == getResources().getDrawable(R.drawable.ic_play_arrow_black_24dp).getConstantState()) {
                    playButton.setBackgroundResource(R.drawable.ic_pause_black_24dp);

                }
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if ( playButton.getBackground().getConstantState() != getResources().getDrawable(R.drawable.ic_play_arrow_black_24dp).getConstantState()) {
                    playButton.setBackgroundResource(R.drawable.ic_play_arrow_black_24dp);

                }
            }
        });

    }
}
