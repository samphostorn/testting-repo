package com.example.ui_control;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     /*   textView=findViewById(R.id.textView1);
        Button button1=(Button) findViewById(R.id.button1);
        textView.setTextColor(Color.GREEN);
        textView.setText("Welcome's");
        textView.setOnClickListener(v->{ //lumda expression



        });*/
       /* button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button in click button2", Toast.LENGTH_SHORT).show();
            }
        });*/

     /*   final ToggleButton tonToggleButton=(ToggleButton) findViewById(R.id.toggleButton);
        tonToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(b){
                    tonToggleButton.setBackgroundColor(Color.parseColor("#aa00ff"));
                }
                else{
                    tonToggleButton.setBackgroundColor(Color.parseColor("#e254ff"));
                }
            }
        });*/

     button2.setOnClickListener(v->{
         Toast.makeText(this,"Register on click with lambda expression",Toast.LENGTH_SHORT).show();
     });
    }
    /*public  void onButtonClicked(View v){
        Toast.makeText(this,textView.getText().toString(),Toast.LENGTH_SHORT).show();
    }*/
   /* View.OnClickListener listener=new View.OnClickListener(){

    }*/



}
