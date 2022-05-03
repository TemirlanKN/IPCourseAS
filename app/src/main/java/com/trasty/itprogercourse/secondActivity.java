package com.trasty.itprogercourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.trasty.itprogercourse.sounds.playSound;

public class secondActivity extends AppCompatActivity {

    private MediaPlayer SPsound;
    private ImageButton spiderManButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        spiderManButton = findViewById(R.id.spiderManButton);

        SPsound = MediaPlayer.create(this, R.raw.spiderman_3_black);

        spiderManButton.setOnClickListener(view -> playSound.soundPlayButton(SPsound));
    }

    public void goBack(View v){
        Intent intent = new Intent(this, MainActivity.class);
        playSound.soundStopButton(SPsound);
        startActivity(intent);
    }

}