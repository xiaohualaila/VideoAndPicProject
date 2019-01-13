package com.example.a38012.videoandpicproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import butterknife.ButterKnife;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

public class JCplayerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jc);
        ButterKnife.bind(this);
        JCVideoPlayerStandard player = findViewById(R.id.jc_video);
        player.setUp("http://2449.vod.myqcloud.com/2449_22ca37a6ea9011e5acaaf51d105342e3.f20.mp4", JCVideoPlayerStandard.SCREEN_LAYOUT_NORMAL,
                JCVideoPlayerStandard.SCREEN_LAYOUT_NORMAL, "嫂子闭眼睛"); // jcVideoPlayerStandard.thumbImageView.setImage("http://p.qpic.cn/videoyun/0/2449_43b6f696980311e59ed467f22794e792_1/640");
        Glide.with(this).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1512110035&di=43af12f288d95526943eab387ad3680a&imgtype=jpg&er=1&src=http%3A%2F%2Fi1.hdslb.com%2Fbfs%2Farchive%2Fce0bfeccf93649e3f279a9fc26a203eb70ca6d4d.jpg").into(player.thumbImageView);

    }

    @Override
    public void onBackPressed() {
        if (JCVideoPlayer.backPress()) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        JCVideoPlayer.releaseAllVideos(); }

}
