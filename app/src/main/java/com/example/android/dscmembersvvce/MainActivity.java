package com.example.android.dscmembersvvce;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Change the values and fields accordingly wherever necessary
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * onClickListener for Explore button to go to ChaptersActivity
         */
        Button button = (Button) findViewById(R.id.explore_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                explore();
            }
        });
    }

    /**
     * method for onClickListener of Explore button
     */
    public void explore() {
        Intent i = new Intent(this, ChaptersActivity.class);
        startActivity(i);
    }

}
