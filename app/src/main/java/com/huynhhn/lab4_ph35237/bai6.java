package com.huynhhn.lab4_ph35237;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class bai6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai6);
        EditText a = findViewById(R.id.txt_User21);
        EditText b = findViewById(R.id.txt_Pass22);
        EditText c = findViewById(R.id.txt_re_Pass21);
        Button bnt = findViewById(R.id.btn_ok);
        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), bai5.class);
                Bundle bundle = new Bundle();
                bundle.putString("user", a.getText().toString());
                bundle.putString("pass", b.getText().toString());
                intent.putExtras(bundle);
                setResult(1,intent);
                finish();


            }
        });
    }


}