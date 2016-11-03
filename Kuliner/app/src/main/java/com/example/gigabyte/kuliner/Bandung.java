package com.example.gigabyte.kuliner;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by GIGABYTE on 03/11/2016.
 */

public class Bandung extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bandung);

        Button next2 = (Button) findViewById(R.id.back_bdg);

        next2.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent (Bandung.this, MainActivity.class);
                                         startActivity(intent);

                                     }
                                 }

        );
    }
}
