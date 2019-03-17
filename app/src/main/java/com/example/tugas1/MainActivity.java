package com.example.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView Image;
    TextView txtnama;
    TextView txtnpm;
    TextView txtttl;
    TextView txtalamat;
    TextView txthobi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView Image = (ImageView) findViewById(R.id.Image);

        txtnama = (TextView) findViewById(R.id.txtnama);
        txtnama.setText("Nama: Eko Wahyu Ramadhan");

        txtnpm = (TextView) findViewById(R.id.txtnpm);
        txtnpm.setText("NPM: 16411031");

        txtttl = (TextView) findViewById(R.id.txtttl);
        txtttl.setText("TTL: Bandar Lampung, 21 Januari 1997");

        txtalamat = (TextView) findViewById(R.id.txtalamat);
        txtalamat.setText("Alamat: Jl. Cengkeh Tengah III No 159");

        txthobi = (TextView) findViewById(R.id.txthobi);
        txthobi.setText("Hobi: Main Musik");


    }
}
