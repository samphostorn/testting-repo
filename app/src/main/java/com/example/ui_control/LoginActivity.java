package com.example.ui_control;

import android.content.Intent;
import android.security.keystore.StrongBoxUnavailableException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.example.ui_control.model.User;

public class LoginActivity extends AppCompatActivity {

    EditText username,password,new_password,emails,first_name,last_name;
    Spinner spn_month,spn_day,spn_year;
    RadioButton rdb_male,rdb_female,rdb_custom;
    Button btn_save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username=findViewById(R.id.edUser);
        password=findViewById(R.id.edPassword);
        new_password=findViewById(R.id.edNewPassword);
        emails=findViewById(R.id.edEmail);
        first_name=findViewById(R.id.edFirstName);
        last_name=findViewById(R.id.edLastName);
        spn_day=(Spinner) findViewById(R.id.spn_day);
        spn_month=(Spinner) findViewById(R.id.spn_month);
        spn_year=(Spinner) findViewById(R.id.spn_year);
        rdb_custom=  findViewById(R.id.rdb_custom);
        rdb_female=findViewById(R.id.rdb_female);
        rdb_male=findViewById(R.id.rdb_male);
        btn_save=findViewById(R.id.btnSave);

        btn_save.setOnClickListener(v->{
            Intent intent=new Intent(this,EditLoginActivity.class);
             String name=username.getText().toString();
             String pass=password.getText().toString();
             String f_name=first_name.getText().toString();
             String l_name=last_name.getText().toString();
             String email=emails.getText().toString();
             String new_pass=new_password.getText().toString();
             String s=spn_day.getSelectedItem().toString()+"/"+spn_month.getSelectedItem().toString()+"/"+spn_year.getSelectedItem().toString();
            String sex="";
             if (rdb_male.isChecked()){
                  sex="Male";
            }
            if(rdb_female.isChecked()){
               sex="Female";
            }
            if(rdb_custom.isChecked()){
                sex="Custom";
            }
            User user=new User();
            user.setName(name);
            user.setPassword(pass);
            user.setNew_password(new_pass);
            user.setEmail(email);
            user.setGender(sex);
            user.setFirst_name(f_name);
            user.setLast_name(l_name);
            user.setBirthday(s);
            Bundle b =new Bundle();
            b.putParcelable("user",user);
            intent.putExtras(b);

            startActivity(intent);

        });
    }
}
