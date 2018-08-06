package com.websarva.wings.android.lifecyclesubactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LifeCycleMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("LifeCycleSample","Main onCreate() called.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_main);
    }

    public void onReStart(){
        Log.i("LifeCycleSample","Main onCreate() called.");
        super.onRestart();
    }

    @Override
    public void onResume(){
        Log.i("LifeCycleSample","Main onCreate() called.");
        super.onResume();
    }

    @Override
    public void onPause(){
        Log.i("LifeCycleSample","Main onCreate() called.");
        super.onPause();
    }

    @Override
    public void onStop(){
        Log.i("LifeCycleSample","Main onCreate() called.");
        super.onStop();
    }

    @Override
    public void onDestroy(){
        Log.i("LifeCycleSample","Main onCreate() called.");
        super.onDestroy();
    }


    public void onButtonClick(View view){
        Intent intent = new Intent(LifeCycleMainActivity.this,LifeCycleSubActivity.class);

        startActivity(intent);
    }




}
