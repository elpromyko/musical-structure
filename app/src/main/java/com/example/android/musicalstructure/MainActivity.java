package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Song> songsList = new ArrayList<Song>();

        songsList.add(new Song("Michael Jackson", "Thriller"));
        songsList.add(new Song("Swedish House Mafia", "The One"));
        songsList.add(new Song("Major Lazer", "Get Free"));
        songsList.add(new Song("Maroon 5", "What Lovers Do"));
        songsList.add(new Song("Michael Jackson", "Thriller"));
        songsList.add(new Song("Swedish House Mafia", "The One"));
        songsList.add(new Song("Major Lazer", "Get Free"));
        songsList.add(new Song("Maroon 5", "What Lovers Do"));
        songsList.add(new Song("Michael Jackson", "Thriller"));
        songsList.add(new Song("Swedish House Mafia", "The One"));
        songsList.add(new Song("Major Lazer", "Get Free"));
        songsList.add(new Song("Maroon 5", "What Lovers Do"));
        songsList.add(new Song("Michael Jackson", "Thriller"));
        songsList.add(new Song("Swedish House Mafia", "The One"));
        songsList.add(new Song("Major Lazer", "Get Free"));
        songsList.add(new Song("Maroon 5", "What Lovers Do"));

        SongAdapter songsAdapter = new SongAdapter(this, songsList);
        final ListView songsListView = findViewById(R.id.songsListView);
        songsListView.setAdapter(songsAdapter);


        songsListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Song songName = (Song) parent.getAdapter().getItem(position);
                        Intent currentlyPlayingIntent = new Intent(MainActivity.this, CurrentlyPLayingActivity.class);

                        currentlyPlayingIntent.putExtra("current_artist", songName.getArtist());
                        currentlyPlayingIntent.putExtra("current_title", songName.getTitle());
                        startActivity(currentlyPlayingIntent);
                    }

                }
        );
    }
}
