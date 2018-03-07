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

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Michael Jackson", "Thriller"));
        songs.add(new Song("Swedish House Mafia", "The One"));
        songs.add(new Song("Major Lazer", "Get Free"));
        songs.add(new Song("Maroon 5", "What Lovers Do"));
        songs.add(new Song("Michael Jackson", "Thriller"));
        songs.add(new Song("Swedish House Mafia", "The One"));
        songs.add(new Song("Major Lazer", "Get Free"));
        songs.add(new Song("Maroon 5", "What Lovers Do"));
        songs.add(new Song("Michael Jackson", "Thriller"));
        songs.add(new Song("Swedish House Mafia", "The One"));
        songs.add(new Song("Major Lazer", "Get Free"));
        songs.add(new Song("Maroon 5", "What Lovers Do"));
        songs.add(new Song("Michael Jackson", "Thriller"));
        songs.add(new Song("Swedish House Mafia", "The One"));
        songs.add(new Song("Major Lazer", "Get Free"));
        songs.add(new Song("Maroon 5", "What Lovers Do"));

        SongAdapter adapter = new SongAdapter(this, songs);
        final ListView songsListView = findViewById(R.id.songsListView);
        songsListView.setAdapter(adapter);


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
