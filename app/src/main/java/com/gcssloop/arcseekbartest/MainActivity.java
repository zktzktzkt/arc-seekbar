package com.gcssloop.arcseekbartest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.gcssloop.widget.ArcSeekBar;

public class MainActivity extends AppCompatActivity {
    private TextView mProgressText;
    private ArcSeekBar mArcSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgressText = findViewById(R.id.txt_progress);
        mArcSeekBar = findViewById(R.id.arc_seek_bar);

        setEngry(mArcSeekBar.getProgress());

        mArcSeekBar.setOnProgressChangeListener(new ArcSeekBar.OnProgressChangeListener() {
            @Override
            public void onProgressChanged(ArcSeekBar seekBar, int progress, boolean isUser) {
                setEngry(seekBar.getProgress());
            }

            @Override
            public void onStartTrackingTouch(ArcSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(ArcSeekBar seekBar) {
                setEngry(seekBar.getProgress());
            }
        });
    }

    private void setEngry(int progress) {
        mProgressText.setText("POWER " + progress + " %");
    }
}
