package com.example.aysen.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tv;
    TextView tvKarakter_Ozellikleri;
    Button bSaldiri;
    Button bYemek;
    Button bUyku;
    karakter k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.cevap);
        bSaldiri = (Button) findViewById(R.id.saldir);
        bSaldiri.setOnClickListener(this);
        bYemek = (Button) findViewById(R.id.yemek);
        bYemek.setOnClickListener(this);
        bUyku = (Button) findViewById(R.id.uyu);
        bUyku.setOnClickListener(this);
        tvKarakter_Ozellikleri = (TextView) findViewById(R.id.karakterozelligi);
        k = new karakter();
        k.kilo = 10;
        k.saldiri_gucu = 50;
        k.hareket_Sayisi = 15;
        tvKarakter_Ozellikleri.setText(k.toString());
        tv.setText("Oyuna Hoşgeldiniz! Lütfen Bir Eylem Belirleyiniz!");
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == bYemek.getId())
            tv.setText(k.yemek());
        else if (v.getId() == bUyku.getId())
            tv.setText(k.uyumak());
        else if (v.getId() == bSaldiri.getId())
            tv.setText(k.saldiri());
        tvKarakter_Ozellikleri.setText(k.toString());
    }
}
