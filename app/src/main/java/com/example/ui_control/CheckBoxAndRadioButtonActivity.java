package com.example.ui_control;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

public class CheckBoxAndRadioButtonActivity extends AppCompatActivity {

    List<String> subject=new ArrayList<>();
    ToggleButton btnToggle;
    Switch btnSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_and_radio_button);

        btnToggle=findViewById(R.id.btnToggle);
        btnSwitch=findViewById(R.id.btnSwitch);
        CheckBox ck=findViewById(R.id.ck_default);
        subject.add(ck.getText().toString());

        btnToggle.setOnCheckedChangeListener((v,isChecked)->{

            if(isChecked)
                btnToggle.setBackgroundColor(Color.RED);
            else
                btnToggle.setBackgroundColor(Color.GREEN);

        });

        btnSwitch.setOnCheckedChangeListener((v,isChecked)->{
            if(isChecked)
                Toast.makeText(this,"On",Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this,"Off",Toast.LENGTH_SHORT).show();

        });
    }

    public void onCheckboxClicked(View v){
        if(v instanceof CheckBox ){
            CheckBox ck=(CheckBox) v;

            if(ck.isChecked()){
                subject.add(ck.getText().toString());
                Toast.makeText(this,"checked",Toast.LENGTH_SHORT).show();
            }
            else{
                subject.remove(ck.getText().toString());
                Toast.makeText(this,"unchecked",Toast.LENGTH_SHORT).show();
            }
            Toast.makeText(this, subject+"",Toast.LENGTH_SHORT).show();
        }


    }

    public  void onRadioGenderClicked(View v){
        RadioButton rd=(RadioButton) v;
        Toast.makeText(this,""+rd.getText().toString(),Toast.LENGTH_SHORT).show();
    }
}
