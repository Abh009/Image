package com.teambhargavinilayam.abh.image;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by ABH on 20-06-2017.
 */

public class SixthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixth_activity);

        Toast.makeText(getApplicationContext(), "DONE", Toast.LENGTH_SHORT).show();
    }
}
