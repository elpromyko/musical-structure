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

        TextView currentArtistView = findViewById(R.id.current_artist);
        currentArtistView.setText(getIntent().getStringExtra("current_artist"));

        TextView currentTitleView = findViewById(R.id.current_title);
        currentTitleView.setText(getIntent().getStringExtra("current_title"));

        final Button playButton = findViewById(R.id.play_button);
        Button stopButton = findViewById(R.id.stop_button);

        playButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (playButton.getBackground().getConstantState() == getResources().getDrawable(R.drawable.ic_play_arrow).getConstantState()) {
                    playButton.setBackgroundResource(R.drawable.ic_pause);

                }
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if ( playButton.getBackground().getConstantState() != getResources().getDrawable(R.drawable.ic_play_arrow).getConstantState()) {
                    playButton.setBackgroundResource(R.drawable.ic_play_arrow);

                }
            }
        });

    }
}
