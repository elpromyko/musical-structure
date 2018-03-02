package com.example.android.musicalstructure;


import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View songView = convertView;
        if (songView == null) {
            songView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
        }
        Song currentSong = getItem(position);

        TextView artistTextView = (TextView) songView.findViewById(R.id.artistName);
        TextView titleTextView = (TextView) songView.findViewById(R.id.songTitle);
        ImageView playImageView = (ImageView) songView.findViewById(R.id.playImage);

        artistTextView.setText(currentSong.getArtist());
        titleTextView.setText(currentSong.getTitle());
        playImageView.setImageResource(android.R.drawable.ic_media_play);

        return songView;
    }

}
