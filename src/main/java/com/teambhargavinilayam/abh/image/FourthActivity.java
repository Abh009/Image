package com.teambhargavinilayam.abh.image;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by ABH on 20-06-2017.
 */

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_activity);

        Toast.makeText(getApplicationContext(), "Image 4", Toast.LENGTH_SHORT).show();

        ImageView img4 = (ImageView) findViewById(R.id.imageView5);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startFifthActivity();
            }
        });
    }

    public void startFifthActivity()
    {
        Intent i = new Intent(getApplicationContext(),FifthActivity.class);
        startActivity(i);
    }
}
