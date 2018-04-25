package com.sleptwolf.learning7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements  TopSectionFragment.TopSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createMeme(String top, String btm) {
        BtmSectionFragment btmFragment = (BtmSectionFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        btmFragment.setMemeText(top, btm);
    }
}
