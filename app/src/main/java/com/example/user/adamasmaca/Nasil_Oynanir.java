package com.example.user.adamasmaca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Nasil_Oynanir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasil__oynanir);
    }
    public void btn_geri2 (View v)
    {
        Intent intent=new Intent(Nasil_Oynanir.this,anaSayfa.class);
        startActivity(intent);

    }
}
