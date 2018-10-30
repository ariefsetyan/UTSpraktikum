package com.example.arief.praktikumuts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Detil extends AppCompatActivity {
    EditText jumlah;
    Button next;
    Double nilai, jum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil);
        jumlah = (EditText) findViewById(R.id.jumlah);
        next = (Button) findViewById(R.id.lanjut);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nilai = Double.parseDouble(jumlah.getText().toString());
                jum = nilai*50000;
                Intent intent = new Intent(Detil.this,MainActivity.class);
                String text1 = Double.toString(jum);
                intent.putExtra("ambil",text1);
                startActivity(intent);
            }
        });

    }
}
