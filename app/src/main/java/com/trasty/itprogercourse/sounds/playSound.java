package com.trasty.itprogercourse.sounds;

import android.media.MediaPlayer;

public class playSound {
    public static void soundPlayButton(MediaPlayer sound) {
        if (sound.isPlaying()){
            sound.pause();
            sound.seekTo(0);
            sound.setLooping(false);
        } else {
            sound.start();
            sound.setLooping(true);
        }
    }

    public static void soundStopButton(MediaPlayer sound){
        if (sound.isPlaying()) {
            sound.pause();
            sound.seekTo(0);
            sound.setLooping(false);
        }
    }
}
