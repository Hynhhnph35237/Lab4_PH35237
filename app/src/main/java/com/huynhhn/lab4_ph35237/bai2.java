package com.huynhhn.lab4_ph35237;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.huynhhn.lab4_ph35237.R;

public class bai2 extends AppCompatActivity {
    private  String TAG = "Status";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai2);

        Button btn = findViewById(R.id.next);
        Log.d(TAG, "onCreate");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bai2.this,bai1.class));
            }
        });    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop 2");
    }
}