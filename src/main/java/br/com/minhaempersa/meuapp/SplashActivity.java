package br.com.minhaempersa.meuapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler hand = new Handler();
        hand.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarPrimeiraTela();
            }
        }, 10000);



    }

    public void mostrarPrimeiraTela(){
        Intent intent = new Intent(
                SplashActivity.this, PrimeiraTela.class
        );
        startActivity(intent);
        finish();
    }
}