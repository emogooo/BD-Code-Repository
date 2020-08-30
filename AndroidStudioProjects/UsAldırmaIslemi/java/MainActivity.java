package com.example.hmemogo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buton;
    EditText sayi, kuvvet,sonuc;
    int sayi1,kuvvet1;
    int carpimSonucu = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sayi = findViewById(R.id.sayi1Text);
        kuvvet = findViewById(R.id.kuvvet1Text);
        sonuc = findViewById(R.id.sonuc1Text);
        buton = findViewById(R.id.btn1);

        buton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        sayi1=Integer.parseInt(sayi.getText().toString());
        kuvvet1 = Integer.parseInt(kuvvet.getText().toString());

        for(int i = 0; i < kuvvet1; i++){
            carpimSonucu = carpimSonucu * sayi1;
        }

        sonuc.setText(carpimSonucu + " ");
        carpimSonucu = 1;
    }

}
