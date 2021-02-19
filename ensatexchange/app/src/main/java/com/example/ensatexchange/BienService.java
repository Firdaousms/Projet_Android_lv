package com.example.ensatexchange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BienService extends AppCompatActivity {

     public Button rechercherBien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bien_service);
        rechercherBien=findViewById(R.id.rechercher_btn);

        rechercherBien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BienService.this,Bien.class);
                startActivity(intent);
            }
        });
    }
}