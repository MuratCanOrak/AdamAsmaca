package com.example.user.adamasmaca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class kategoriler extends AppCompatActivity {
int j=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategoriler);
    }
    public void btn_geri (View v)
    {
        Intent intent=new Intent(kategoriler.this,anaSayfa.class);
        startActivity(intent);

    }
    public void btn_bilim(View v)
    {
        Intent intent=new Intent(kategoriler.this,Bilim.class);
        startActivity(intent);
    }
    public void btn_tarih (View v)
    {
        Intent intent=new Intent(kategoriler.this,Tarih.class);
        startActivity(intent);

    }

    public void btn_sanat (View v)
    {
        Intent intent=new Intent(kategoriler.this,Sanat.class);
        startActivity(intent);
    }
    public void btn_eglence (View v)
    {
        Intent intent=new Intent(kategoriler.this,Eglence.class);
        startActivity(intent);
    }
    public void btn_spor (View v)
    {
        Intent intent=new Intent(kategoriler.this,Spor.class);
        startActivity(intent);
    }
    public void btn_edebiyat (View v)
    {
        Intent intent=new Intent(kategoriler.this,Edebiyat.class);
        startActivity(intent);
    }
    public void btn_cografya (View v)
    {
        Intent intent=new Intent(kategoriler.this,Cografya.class);
        startActivity(intent);
    }

}
