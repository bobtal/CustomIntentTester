package com.example.bobtal.customintenttester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.teamtreehouse.musicmachine.models.Song;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        Intent intent = getIntent();

        if ("com.teamtreehouse.intent.action.SHARE_SONG".equals(intent.getAction())) {
            Song song = intent.getParcelableExtra("EXTRA_SONG");
            textView.setText(song.toString());
        }
    }
}
