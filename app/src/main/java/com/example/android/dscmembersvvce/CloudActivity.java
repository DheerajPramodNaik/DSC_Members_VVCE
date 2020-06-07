package com.example.android.dscmembersvvce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Change the values and fields accordingly wherever necessary
 */

public class CloudActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.android.dscmembersvvce.EXTRA_TEXT";
    public static final String EXTRA_TEXT2 = "com.example.android.dscmembersvvce.EXTRA_TEXT2";
    public static final String EXTRA_NUMBER = "com.example.android.dscmembersvvce.EXTRA_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloud);

        /**
         * Cloud Chapter Member 1
         */
        final RelativeLayout member1 = (RelativeLayout) findViewById(R.id.chapter_cloud_m1);
        member1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img1 = (ImageView) findViewById(R.id.cloud_m1_image);

                String number = "0123456789"; //Contact Number of Member 1

                TextView name = (TextView) findViewById(R.id.cloud_m1_name);
                String name1 = name.getText().toString();

                TextView sem = (TextView) findViewById(R.id.cloud_m1_sem);
                String sem1 = sem.getText().toString();

                memberclick(name1, sem1, number);
            }
        });

        /**
         * Cloud Chapter Member 2
         */
        final RelativeLayout member2 = (RelativeLayout) findViewById(R.id.chapter_cloud_m2);
        member2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img1 = (ImageView) findViewById(R.id.cloud_m2_image);

                String number = "0123456789"; //Contact Number of Member 2

                TextView name = (TextView) findViewById(R.id.cloud_m2_name);
                String name1 = name.getText().toString();

                TextView sem = (TextView) findViewById(R.id.cloud_m2_sem);
                String sem1 = sem.getText().toString();

                memberclick(name1, sem1, number);
            }
        });

        /**
         * Cloud Chapter Member 3
         */
        final RelativeLayout member3 = (RelativeLayout) findViewById(R.id.chapter_cloud_m3);
        member3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img1 = (ImageView) findViewById(R.id.cloud_m3_image);

                String number = "0123456789"; //Contact Number of Member 3

                TextView name = (TextView) findViewById(R.id.cloud_m3_name);
                String name1 = name.getText().toString();

                TextView sem = (TextView) findViewById(R.id.cloud_m3_sem);
                String sem1 = sem.getText().toString();

                memberclick(name1, sem1, number);
            }
        });

        /**
         * Cloud Chapter Member 4
         */
        final RelativeLayout member4 = (RelativeLayout) findViewById(R.id.chapter_cloud_m4);
        member4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img1 = (ImageView) findViewById(R.id.cloud_m4_image);

                String number = "0123456789"; //Contact Number of Member 4

                TextView name = (TextView) findViewById(R.id.cloud_m4_name);
                String name1 = name.getText().toString();

                TextView sem = (TextView) findViewById(R.id.cloud_m4_sem);
                String sem1 = sem.getText().toString();

                memberclick(name1, sem1, number);
            }
        });

        /**
         * Cloud Chapter Member 5
         */
        final RelativeLayout member5 = (RelativeLayout) findViewById(R.id.chapter_cloud_m5);
        member5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img1 = (ImageView) findViewById(R.id.cloud_m5_image);

                String number = "0123456789"; //Contact Number of Member 5

                TextView name = (TextView) findViewById(R.id.cloud_m5_name);
                String name1 = name.getText().toString();

                TextView sem = (TextView) findViewById(R.id.cloud_m5_sem);
                String sem1 = sem.getText().toString();

                memberclick(name1, sem1, number);
            }
        });

        /**
         * Cloud Chapter Member 6
         */
        final RelativeLayout member6 = (RelativeLayout) findViewById(R.id.chapter_cloud_m6);
        member6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img1 = (ImageView) findViewById(R.id.cloud_m6_image);

                String number = "0123456789"; //Contact Number of Member 6

                TextView name = (TextView) findViewById(R.id.cloud_m6_name);
                String name1 = name.getText().toString();

                TextView sem = (TextView) findViewById(R.id.cloud_m6_sem);
                String sem1 = sem.getText().toString();

                memberclick(name1, sem1, number);
            }
        });

        /**
         * Cloud Chapter Member 7
         */
        final RelativeLayout member7 = (RelativeLayout) findViewById(R.id.chapter_cloud_m7);
        member7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img1 = (ImageView) findViewById(R.id.cloud_m7_image);

                String number = "0123456789"; //Contact Number of Member 7

                TextView name = (TextView) findViewById(R.id.cloud_m7_name);
                String name1 = name.getText().toString();

                TextView sem = (TextView) findViewById(R.id.cloud_m7_sem);
                String sem1 = sem.getText().toString();

                memberclick(name1, sem1, number);
            }
        });

        /**
         * Cloud Chapter Member 8
         */
        final RelativeLayout member8 = (RelativeLayout) findViewById(R.id.chapter_cloud_m8);
        member8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img1 = (ImageView) findViewById(R.id.cloud_m8_image);

                String number = "0123456789"; //Contact Number of Member 8

                TextView name = (TextView) findViewById(R.id.cloud_m8_name);
                String name1 = name.getText().toString();

                TextView sem = (TextView) findViewById(R.id.cloud_m8_sem);
                String sem1 = sem.getText().toString();

                memberclick(name1, sem1, number);
            }
        });

        /**
         * Cloud Chapter Member 9
         */
        final RelativeLayout member9 = (RelativeLayout) findViewById(R.id.chapter_cloud_m9);
        member9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img1 = (ImageView) findViewById(R.id.cloud_m9_image);

                String number = "0123456789"; //Contact Number of Member 9

                TextView name = (TextView) findViewById(R.id.cloud_m9_name);
                String name1 = name.getText().toString();

                TextView sem = (TextView) findViewById(R.id.cloud_m9_sem);
                String sem1 = sem.getText().toString();

                memberclick(name1, sem1, number);
            }
        });

        /**
         * Cloud Chapter Member 10
         */
        final RelativeLayout member10 = (RelativeLayout) findViewById(R.id.chapter_cloud_m10);
        member10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img1 = (ImageView) findViewById(R.id.cloud_m10_image);

                String number = "0123456789"; //Contact Number of Member 10

                TextView name = (TextView) findViewById(R.id.cloud_m10_name);
                String name1 = name.getText().toString();

                TextView sem = (TextView) findViewById(R.id.cloud_m10_sem);
                String sem1 = sem.getText().toString();

                memberclick(name1, sem1, number);
            }
        });
    }

    /**
     * Method to pass the intent of Cloud chapter members details to DisplayActivity
     *
     * @param name is name of the member
     * @param sem  is sem of the member
     * @param number is the contact number of the member
     */
    public void memberclick(String name, String sem, String number) {
        Intent intent = new Intent(this, DisplayActivity.class);
        intent.putExtra(EXTRA_TEXT, name);
        intent.putExtra(EXTRA_TEXT2, sem);
        intent.putExtra(EXTRA_NUMBER, number);
        startActivity(intent);
    }
}
