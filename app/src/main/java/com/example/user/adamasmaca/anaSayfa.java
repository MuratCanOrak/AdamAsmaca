package com.example.user.adamasmaca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class anaSayfa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anasayfa);

    }



public void btn_baslat(View v)
{
    Intent intent=new Intent(anaSayfa.this,kategoriler.class);
    startActivity(intent);
}

    public void btn_nasil (View v)
    {
        Intent intent=new Intent(anaSayfa.this,Nasil_Oynanir.class);
        startActivity(intent);
    }

    public void btn_hakkinda (View v)
    {
        Intent intent=new Intent(anaSayfa.this,hakkinda.class);
        startActivity(intent);
    }

    public void btn_ayarlar (View v)
    {
        Intent intent=new Intent(anaSayfa.this,Ayarlar.class);
        startActivity(intent);
    }
    public void btn_cikis (View v)
    {
       finish();
    }

}
