package com.example.abhi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);


        Button callme = findViewById(R.id.callmeBT);
        callme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewTelegram();

            }
        });



    }

    private void  viewTelegram(){
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/arabhi"));
        startActivity(implicit);


    }

}
