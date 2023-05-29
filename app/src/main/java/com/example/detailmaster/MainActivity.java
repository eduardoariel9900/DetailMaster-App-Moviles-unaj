package com.example.detailmaster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

public class MainActivity extends FragmentActivity
                          implements UrlFragment.MiListener{

    @Override
    protected void onCreate(Bundle saveduInstanceState){
        super.onCreate(saveduInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onButtonClick(String url) {
        VistaFragment vistaFragment = (VistaFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragment_vista);
        vistaFragment.viewPage(url);
    }

}