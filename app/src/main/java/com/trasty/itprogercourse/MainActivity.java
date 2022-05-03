package com.trasty.itprogercourse;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.trasty.itprogercourse.sounds.playSound;

public class MainActivity extends AppCompatActivity {

    private ImageButton mortalCombat;
    private MediaPlayer mkSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mortalCombat = findViewById(R.id.mortalKombatImage);

        mkSound = MediaPlayer.create(this, R.raw.mortal_kombat);

        mortalCombat.setOnClickListener(view -> playSound.soundPlayButton(mkSound));
    }

    public void startNewActivity(View v){
        Intent intent = new Intent(this, secondActivity.class);
        playSound.soundStopButton(mkSound);
        startActivity(intent);
    }

}