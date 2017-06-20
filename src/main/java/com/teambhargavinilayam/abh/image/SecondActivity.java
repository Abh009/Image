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

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Toast.makeText(getApplicationContext(),"Image 2",Toast.LENGTH_SHORT).show();

        ImageView img2 = (ImageView) findViewById(R.id.imageView2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startThirdActivity();
            }
        });
    }

    public void startThirdActivity()
    {
        Intent i = new Intent(getApplicationContext(),ThirdActivity.class);
        startActivity(i);
    }

    }
