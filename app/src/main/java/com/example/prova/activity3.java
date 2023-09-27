package com.example.prova;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class activity3 extends activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Vinculando minha view ao meu controller
        setContentView(R.layout.tela3);
        Button buttonCliqueAqui = findViewById(R.id.vermais);
        buttonCliqueAqui.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity.this, activity3.class);

            }
        });
    }
}
