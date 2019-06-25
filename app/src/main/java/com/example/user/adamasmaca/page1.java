package com.example.user.adamasmaca;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class page1 extends AppCompatActivity {
    VideoView videoView;
    MediaPlayer ses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animasyon);

        videoView=(VideoView)findViewById(R.id.videoView2);

       Uri uri=Uri.parse("android.resource://"+ getPackageName() + "/" + R.raw.intro);

        ses = MediaPlayer.create(page1.this,R.raw.ses);
       videoView.setVideoURI(uri);
       ses.start();

        videoView.start();

        Thread thread=new Thread(){

            public void run()
            {
                try{
                    sleep(3000);
                    Intent intent=new Intent(getApplicationContext(),anaSayfa.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();

    }
}
