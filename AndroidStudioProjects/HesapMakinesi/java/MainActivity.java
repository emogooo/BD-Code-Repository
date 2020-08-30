package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText  et1, et2;
    Button toplama, cikarma, bolme, carpma;   // Kodlamada kullanacağımız değişkenler oluşturuldu.
    TextView sonuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.etsayi1);
        et2 = findViewById(R.id.etSayi2);
        toplama = findViewById(R.id.btnTopla);
        cikarma = findViewById(R.id.btnCikar);          // Oluşturduğumuz değişkenleri arayüzdeki nesnelerle iliştirdik.
        carpma = findViewById(R.id.btnCarpma);
        bolme = findViewById(R.id.btnBolme);
        sonuc = findViewById(R.id.tvSonuc);

        // Arayüzdeki butonları kullanmak için 3 farklı yöntem mevcuttur, üçünüde kodda kullandık.

        /* Birinci yöntemde toplama butonuna tıklama dinleyicisi(setOnClickListener) ve tıklandığında
           çalıştırılacak metod(onClick) eklendi. Metoda textBox1 ve 2 den alınan değerleri
           int'e çevir, topla, stringe çevir ve yazdır komutu yazıldı. Ayrıca butona basıldığında
           sonuç textView'inin arka planıda "CYAN" rengine dönüşecektir.
        */

        /* İkinci yöntemde cikarma isminde bir metod oluşturduk. Bu metoda kullanıcıdan alınan iki
           sayının farkını sonuc textView'ine yazan ve "-" butonuna basıldığında sonuc textView'inin
           arka planını yeşile boyayan komutu yazdık. Ve son olarak activity_main.xml dosyasındaki
           "-" butonunun kodlarına butona tıklandığında cikarma metodunu çalıştırma komutunu ekledik.
         */

        /* Üçüncü yöntemde yaptıklarımız birinci yöntemde yaptıklarımıza benziyor. İlk olarak çarpma ve
           bölme butonlarımıza buton tıklama dinleyicisi ekledik.(3. YÖNTEM BAŞLANGICI) Daha sonra
           onClick isimli ezme metodunu global olarak oluşturduk. Bu metod (onClick) bölme veya çarpma butonuna tıklandığında
           çalışacaktır. Bu metodun içine çarpma butonuna tıklandığında sayıları çarpıp yazacak, bölme butonuna tıklandığında
           sayıları bölüp yazacak olan komut yazıldı.

         */

        carpma.setOnClickListener(this);                                         // 3. YÖNTEM BAŞLANGICI
        bolme.setOnClickListener(this);                                          // 3. YÖNTEM BAŞLANGICI

        toplama.setOnClickListener(new View.OnClickListener() {                  // 1. YÖNTEM
            @Override
            public void onClick(View v) {
                sonuc.setText((Integer.parseInt(et1.getText().toString())
                        +Integer.parseInt(et2.getText().toString())) + " ");
                sonuc.setBackgroundColor(Color.CYAN);
            }
        });




    }

    public void cikarma(View view){                                                 // 2. YÖNTEM
        sonuc.setText((Integer.parseInt(et1.getText().toString())
                -Integer.parseInt(et2.getText().toString())) + " ");
        sonuc.setBackgroundColor(Color.GREEN);

    }


    @Override
    public void onClick(View v) {                                                  // 3. YÖNTEM SONU
        if(v.getId() == R.id.btnCarpma)
           sonuc.setText((Integer.parseInt(et1.getText().toString())
                * Integer.parseInt(et2.getText().toString())) + " ");
        else
            sonuc.setText((Integer.parseInt(et1.getText().toString())
                    / Integer.parseInt(et2.getText().toString())) + " ");
    }
}
