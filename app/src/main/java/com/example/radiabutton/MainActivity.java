package com.example.radiabutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup =(RadioGroup) findViewById(R.id.radioGroupID);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radioButton=(RadioButton) findViewById(checkedId);

                switch (radioButton.getId()){
                    case R.id.YesId:{
                        if(radioButton.isChecked()){
                        Log.d("RD","YES!!");

                    }}

                    break;
                    case  R.id.noID:{
                        if(radioButton.isChecked()){
                        Log.d("RD","NO!!");
                    }}
                    break;
                    case R.id.maybe:{
                        if (radioButton.isChecked()){
                        Log.d("RD","MAYBE!!");
                    }}
                }
            }
        });
    }
}