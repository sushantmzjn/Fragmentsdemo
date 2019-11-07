package com.sushant.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sushant.fragments.fragments.FirstFragment;
import com.sushant.fragments.fragments.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnloadfragment;
    private Boolean status =  true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnloadfragment = findViewById(R.id.btnFragment);
        btnloadfragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (status){
            FirstFragment firstFragment = new FirstFragment();
            fragmentTransaction.replace(R.id.linerLayout,firstFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            btnloadfragment.setText("Load Second Fragment");
            status = false;
        }
        else
        {
            SecondFragment secondFragment = new SecondFragment();
            fragmentTransaction.replace(R.id.linerLayout,secondFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            btnloadfragment.setText("Load First Fragment");
            status = true;
        }

    }
}
