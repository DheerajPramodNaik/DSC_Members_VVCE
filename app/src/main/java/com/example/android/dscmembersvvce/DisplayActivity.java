package com.example.android.dscmembersvvce;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Change the values and fields accordingly wherever necessary
 */

public class DisplayActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);


        final Intent intent = getIntent();

        String name = intent.getStringExtra(AndroidActivity.EXTRA_TEXT);
        String sem = intent.getStringExtra(AndroidActivity.EXTRA_TEXT2);

        TextView name1 = (TextView) findViewById(R.id.name_display);
        TextView sem1 = (TextView) findViewById(R.id.sem_display);

        name1.setText(name);
        sem1.setText(sem);

        ImageView bt = (ImageView) findViewById(R.id.close_btn);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }




        });

        Button call = findViewById(R.id.call_display);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String number = intent.getStringExtra(AndroidActivity.EXTRA_NUMBER);

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+number));
                startActivity(callIntent);
            }
        });
    }
}
