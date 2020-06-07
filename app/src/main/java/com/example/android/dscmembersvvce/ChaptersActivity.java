package com.example.android.dscmembersvvce;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Change the values and fields accordingly wherever necessary
 */

public class ChaptersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters);

        final LinearLayout android = (LinearLayout) findViewById(R.id.chapter_android);
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android();
            }
        });

        final LinearLayout ml = (LinearLayout) findViewById(R.id.chapter_ml);
        ml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ml();
            }
        });

        final LinearLayout web = (LinearLayout) findViewById(R.id.chapter_web);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web();
            }
        });

        final LinearLayout cloud = (LinearLayout) findViewById(R.id.chapter_cloud);
        cloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cloud();
            }
        });
    }

    public void android() {
        Intent i = new Intent(this, AndroidActivity.class);
        startActivity(i);
    }

    public void ml() {
        Intent i = new Intent(this, MlActivity.class);
        startActivity(i);
    }

    public void web() {
        Intent i = new Intent(this, WebActivity.class);
        startActivity(i);
    }

    public void cloud() {
        Intent i = new Intent(this, CloudActivity.class);
        startActivity(i);
    }


}
