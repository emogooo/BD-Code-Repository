package com.example.dolap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] urunler = {"Ayakkabı", "Telefon", "Araba", "Çorap", "Saat"};
        ListView liste = findViewById(R.id.list_urunler);

        ArrayList<Urunler> ur = new ArrayList<Urunler>();
        ur.add(new Urunler(R.drawable.bmw, "BMW", "ARABA", 3500));
        ur.add(new Urunler(R.drawable.corap, "corap", "corap", 3));
        ur.add(new Urunler(R.drawable.saat, "saat", "saat", 3500));
        ur.add(new Urunler(R.drawable.telefon, "telefon", "telefon", 3500));
        ur.add(new Urunler(R.drawable.ab, "Ayakkabı", "ayakkabı", 3.5));
        DolapAdapter d = new DolapAdapter(this, ur);

        liste.setAdapter(d);

    }

}
