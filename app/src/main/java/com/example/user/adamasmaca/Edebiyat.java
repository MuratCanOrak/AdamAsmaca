package com.example.user.adamasmaca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Edebiyat extends AppCompatActivity {
    TextView kelime,ipucu,score,kelimebilgi;
    EditText harf;
    Button dene,button3;
    int sayac = 0;
    ImageView resim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_edebiyat);


        kelime = (TextView)findViewById(R.id.textView);
        ipucu = (TextView)findViewById(R.id.ipucu);
        kelimebilgi = (TextView)findViewById(R.id.textView2);
        harf = (EditText)findViewById(R.id.editText);
        dene = (Button)findViewById(R.id.button);
        resim = (ImageView)findViewById(R.id.imageView);
        score = (TextView)findViewById(R.id.textView5);
        button3 = (Button)findViewById(R.id.button3);

        // Kelimelerin bulunacağı diziyi olusturuyoruz
        final String [] kelimeler = {"TURGUTUYAR","NECİPFAZILKISAKÜREK","ARABASEVDASI","NAZIMHİKMET","NESİR"};

        // İpuçlarının bulunacağı diziyi olusturuyoruz
        final String [] ipuclari = {"Şair ","Kaldırımlar Şiiri","Roman","Ran",""};

        //Kelime listemizdeki kelime sayısını geçmeyecek random sayı üretiyoruz
        final int rastgele = (int)(Math.random()* kelimeler.length);

        //Kullanıcıdan kelimede aranacak harfi alıyoruz
        final String[] gelenharf = {harf.getText().toString()};

        //Kelimeler dizimizden random bir kelime secip kullanıcıya sunuyoruz
        final String secilen = kelimeler[rastgele];

        //Atadığımız stringi char dizisine ceviriyoruz
        final char[] charArray = secilen.toCharArray();

        //Çöp adamın asılmasını sağlayacak fotoğrafları diziye atıyoruz
        final int images[] = {R.drawable.sifir,R.drawable.bir,R.drawable.iki,R.drawable.uc,R.drawable.dort,R.drawable.bes,R.drawable.son};

        //Kelimedeki harf sayısı kadar "_" koyar
        final char answer[] = new char[secilen.length()];
        int k;
        for(k=0;k<charArray.length;k++)
        {
            answer[k]='_';
        }

        kelime.setText(answer, 0, k);

        //İlk görünecek olan çarmıhı ekrana veriyoruz
        resim.setImageResource(images[0]);

        //Kelimenin kaç harften oluştuğu bilgisini veriyoruz
        kelimebilgi.setText("Kelime\n"+charArray.length + " Harften Olusuyor");

        //ANA FONKSİYONUMUZ

        dene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=0;
                int p;
                int k = 0;


                gelenharf[0] = harf.getText().toString();

                for (p = 0; p < charArray.length; p++) {
                    if (gelenharf[0].equals(String.valueOf(charArray[p]))) {
                        answer[p] = gelenharf[0].charAt(0);

                        kelime.setText(String.valueOf(answer));

                    } else {
                        a++;
                    } if (a == charArray.length){
                        sayac++;
                    } if(sayac == 1){
                        Toast.makeText(getApplicationContext(), "1 Hakkınız Gitti "+charArray.length+ " Harften Olusuyor", Toast.LENGTH_SHORT).show();
                        resim.setImageResource(images[1]);
                        ipucu.setText(ipuclari[rastgele]);

                    } else if (sayac == 2){
                        Toast.makeText(getApplicationContext(), "2 Hakkınız"+charArray.length+ " Harften Olusuyor", Toast.LENGTH_SHORT).show();
                        resim.setImageResource(images[2]);
                    }else if (sayac == 3){
                        Toast.makeText(getApplicationContext(), "3 Hakkınız Gitti "+charArray.length+ " Harften Olusuyor", Toast.LENGTH_SHORT).show();
                        resim.setImageResource(images[3]);
                    }else if (sayac == 4){
                        Toast.makeText(getApplicationContext(), "4 Hakkınız Gitti  gitti dikkatli ol!  "+charArray.length+ " Harften Olusuyor", Toast.LENGTH_SHORT).show();
                        resim.setImageResource(images[4]);
                    }else if (sayac == 5){
                        Toast.makeText(getApplicationContext(), "5 Hakkınız Gitti "+charArray.length+ " Harften Olusuyor", Toast.LENGTH_SHORT).show();
                        resim.setImageResource(images[5]);
                    }else if (sayac == 6){
                        Toast.makeText(getApplicationContext(), "6 Hakkınız Gitti "+charArray.length+ " Harften Olusuyor", Toast.LENGTH_SHORT).show();
                        resim.setImageResource(images[6]);
                        kelime.setText("Kaybettiniz, " + secilen.toString() + " kelimesini bilemediniz");
                        button3.setVisibility(View.VISIBLE);
                        ipucu.setVisibility(View.INVISIBLE);
                        dene.setVisibility(View.INVISIBLE);
                    }
                }
                String cevap = String.valueOf(answer);
                harf.setText("");

                if(cevap.equals(secilen)){
                    kelime.setText("Tebrikler Bildiniz!");
                    ipucu.setVisibility(View.INVISIBLE);
                    button3.setVisibility(View.VISIBLE);
                    dene.setVisibility(View.INVISIBLE);

                }
            }
        });

    }

    public void btn_geri2(View v) {
        Intent intent = new Intent(Edebiyat.this, kategoriler.class);
        startActivity(intent);

    }

    public void ilerle(View v){
        dene.setText("DENE");
        dene.setVisibility(View.VISIBLE);
        button3.setVisibility(View.INVISIBLE);
        final String [] kelimeler = {"TURGUTUYAR","NECİPFAZILKISAKÜREK","ARABASEVDASI","NAZIMHİKMET","NAZIM","NESİR"};
        final String [] ipuclari = {"Cihan Fatihi","Savaş","Osmanlı'da Asker","İlk Osmanlı\n Halifesi","Yazıtlar","Türkler'e \n Müslümanlığı Getirdi"};

        sayac = 0;

        final int rastgele = (int)(Math.random()* kelimeler.length);
        final String[] gelenharf = {harf.getText().toString()};

        final String secilen = kelimeler[rastgele];
        final char[] charArray = secilen.toCharArray();


        final char answer[] = new char[secilen.length()];

        final int images[] = {R.drawable.sifir,R.drawable.bir,R.drawable.iki,R.drawable.uc,R.drawable.dort,R.drawable.bes,R.drawable.son};

        int k;
        for(k=0;k<charArray.length;k++)
        {
            answer[k]='_';
        }
        kelime.setText(answer, 0, k);

        resim.setImageResource(images[0]);
        kelimebilgi.setText("Kelime\n"+charArray.length + " Harften Olusuyor");

        dene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=0;
                int p;
                int k = 0;


                gelenharf[0] = harf.getText().toString();
                for (p = 0; p < charArray.length; p++) {
                    if (gelenharf[0].equals(String.valueOf(charArray[p]))) {
                        answer[p] = gelenharf[0].charAt(0);
                        kelime.setText(String.valueOf(answer));

                    } else {
                        a++;
                    } if (a == charArray.length){
                        sayac++;

                    } if(sayac == 1){
                        Toast.makeText(getApplicationContext(), "1 Hakkınız Gitti "+charArray.length+ " Harften Olusuyor", Toast.LENGTH_SHORT).show();
                        resim.setImageResource(images[1]);
                        ipucu.setVisibility(View.VISIBLE);
                        ipucu.setText(ipuclari[rastgele]);

                    } else if (sayac == 2){
                        Toast.makeText(getApplicationContext(), "2 Hakkınız"+charArray.length+ " Harften Olusuyor", Toast.LENGTH_SHORT).show();
                        resim.setImageResource(images[2]);
                    }else if (sayac == 3){
                        Toast.makeText(getApplicationContext(), "3 Hakkınız Gitti "+charArray.length+ " Harften Olusuyor", Toast.LENGTH_SHORT).show();
                        resim.setImageResource(images[3]);
                    }else if (sayac == 4){
                        Toast.makeText(getApplicationContext(), "4 Hakkınız Gitti  gitti dikkatli ol!  "+charArray.length+ " Harften Olusuyor", Toast.LENGTH_SHORT).show();
                        resim.setImageResource(images[4]);
                    }else if (sayac == 5){
                        Toast.makeText(getApplicationContext(), "5 Hakkınız Gitti "+charArray.length+ " Harften Olusuyor", Toast.LENGTH_SHORT).show();
                        resim.setImageResource(images[5]);
                    }else if (sayac == 6){
                        Toast.makeText(getApplicationContext(), "6 Hakkınız Gitti "+charArray.length+ " Harften Olusuyor", Toast.LENGTH_SHORT).show();
                        resim.setImageResource(images[6]);
                        kelime.setText("Kaybettiniz, " + secilen.toString() + " kelimesini bilemediniz");
                        button3.setVisibility(View.VISIBLE);
                        ipucu.setVisibility(View.INVISIBLE);
                        dene.setVisibility(View.INVISIBLE);

                        dene.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v)
                            {

                            }
                        });
                    }
                }
                String cevap = String.valueOf(answer);
                harf.setText("");

                if(cevap.equals(secilen)){

                    kelime.setText("Tebrikler Bildiniz!");
                    ipucu.setVisibility(View.INVISIBLE);
                    button3.setVisibility(View.VISIBLE);
                    dene.setVisibility(View.INVISIBLE);

                }
            }
        });

    }

}
