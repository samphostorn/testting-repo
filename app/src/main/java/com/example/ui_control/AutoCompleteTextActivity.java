package com.example.ui_control;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class AutoCompleteTextActivity extends AppCompatActivity implements  DatePickerDialog.OnDateSetListener {
    AutoCompleteTextView textView;
    List<String> completion=new ArrayList<>();
    TextView tvdate;
    TextView tvtime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text);

        textView=findViewById(R.id.autocomplete);
        tvdate=findViewById(R.id.tv_date);
        tvtime=findViewById(R.id.tv_time);
        completion.add("Book");
        completion.add("pen");
        completion.add("pens");
        completion.add("cate");


        //crate adapter

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                this,android.R.layout.simple_dropdown_item_1line,completion
        );
        textView.setAdapter(adapter);
        textView.getText().toString();

    }

    //Create methods for button click
    public  void onPickeDate(View v){
        createDatePicker().show();
    }
    public  void onPickeTime(View v){

    }

    private DatePickerDialog createDatePicker(){
        Calendar calendar=Calendar.getInstance();
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        int month=calendar.get(Calendar.MONTH);
        int yy=calendar.get(Calendar.YEAR);
        return  new DatePickerDialog(this,this,yy,month,day);
    }
    public  void onDateSet(DatePicker view,int year,int month,int dayOfMonth){
        String mm=month+1<10 ? "0"+(month+1):(month+1)+"";
        String day=dayOfMonth<10 ?"0"+(dayOfMonth+1) : (dayOfMonth+1) +"";
        tvdate.setText(day+"/"+mm+"/"+year);

    }
}
