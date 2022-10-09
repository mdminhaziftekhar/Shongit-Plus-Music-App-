package com.example.musicplayerplus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class customAdaper extends ArrayAdapter<songsClass> {
    public customAdaper(@NonNull Context context, int resource, @NonNull ArrayList<songsClass> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentItemView = convertView;

        if(currentItemView == null){
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.newlist, parent, false);

        }

        songsClass currentSong = getItem(position);
        assert currentSong != null;

        TextView textView = currentItemView.findViewById(R.id.textView2);
        textView.setText(currentSong.getS());

        return currentItemView;
    }
}
