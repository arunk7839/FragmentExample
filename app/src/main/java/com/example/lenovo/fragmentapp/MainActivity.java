package com.example.lenovo.fragmentapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void getFragment(View view) {
        switch (view.getId()) {

            case R.id.btn_frag1: {
                Fragment1 fragment = new Fragment1();
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_fragment, fragment).commit();
                break;
            }
            case R.id.btn_frag2: {
                Fragment2 fragment = new Fragment2();
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_fragment, fragment).commit();
                break;
            }

        }
    }


}
