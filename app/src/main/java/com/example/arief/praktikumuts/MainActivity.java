package com.example.arief.praktikumuts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button beli1,beli2,beli3,beli4,beli5,beli6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        beli1 = (Button)findViewById(R.id.beli1);
        beli2 = (Button)findViewById(R.id.beli2);
        beli3 = (Button)findViewById(R.id.beli3);

        beli1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intbeli1 = new Intent(MainActivity.this,Detil.class);
                startActivity(Intbeli1);
            }
        });
        Intent XX =getIntent();
        if (XX.getStringExtra("ambil")!=null){
            String hasil = XX.getStringExtra("ambil");
            Toast.makeText(this,"Mouse"+" 50000 "+ hasil, Toast.LENGTH_SHORT).show();
        }


    }
}
