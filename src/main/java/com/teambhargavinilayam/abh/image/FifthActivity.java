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

public class FifthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_activity);

        Toast.makeText(getApplicationContext(), "Image 5", Toast.LENGTH_SHORT).show();

        ImageView img5 = (ImageView) findViewById(R.id.imageView6);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSixthActivity();
            }
        });
    }

    public void startSixthActivity()
    {
        Intent i = new Intent(getApplicationContext(),SixthActivity.class);
        startActivity(i);
    }
}
