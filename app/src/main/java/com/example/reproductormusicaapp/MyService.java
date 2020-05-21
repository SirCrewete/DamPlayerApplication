package com.example.reproductormusicaapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {

    @Nullable
    @Override

    public IBinder onBind(Intent intent) {
        return null;
    }

    MediaPlayer player = new MediaPlayer();

    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "servicio iniciado", Toast.LENGTH_SHORT);
/*        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(25000);
                    System.out.println("Finalizacion del thread");
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
    thread.start();
    */

        if (player != null && player.isPlaying()) {
            player.stop();
        }
        player = MediaPlayer.create(this, R.raw.hammer);
        player.setLooping(true);
        player.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy(){
        Toast.makeText(this, "Servicio finalizado", Toast.LENGTH_SHORT).show();
        if (player != null){
            player.release();
        }
        super.onDestroy();
    }
}