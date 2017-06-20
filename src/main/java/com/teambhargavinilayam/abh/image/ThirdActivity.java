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

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);

        Toast.makeText(getApplicationContext(), "Image 3", Toast.LENGTH_SHORT).show();

        ImageView img3 = (ImageView) findViewById(R.id.imageView3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startFourthActivity();
            }
        });
    }

    public void startFourthActivity()
    {
        Intent i = new Intent(getApplicationContext(),FourthActivity.class);
        startActivity(i);
    }
}
