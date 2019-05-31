package com.example.ui_control;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.ui_control.model.User;

public class EditLoginActivity extends AppCompatActivity {
    TextView tv_username,tv_password,tv_new_password,tv_email,tv_first_name,tv_last_name,tv_gender,tv_dob;
    Spinner spn_month,spn_day,spn_year;
    RadioButton rdb_male,rdb_female,rdb_custom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_login);
        tv_first_name=findViewById(R.id.ed_edit_FirstName);
        tv_username=findViewById(R.id.ed_edit_User);
        tv_last_name=findViewById(R.id.ed_edit_LastName);
        tv_password=findViewById(R.id.ed_edit_Password);
        tv_new_password=findViewById(R.id.edEditNewPassword);
        tv_gender=findViewById(R.id.ed_edit_Gender);
        tv_email=findViewById(R.id.ed_edit_Email);
        tv_dob=findViewById(R.id.ed_edit_dob);

        Intent intent=getIntent();
        if(intent!=null){
            User user=intent.getParcelableExtra("user");

                tv_username.setText("User Name: "+user.getName());
                tv_password.setText("Password: "+user.getPassword());
                tv_first_name.setText("First Name: "+user.getFirst_name());
                tv_last_name.setText("Last Name: "+user.getLast_name());
                tv_new_password.setText("New Password: "+user.getNew_password());
                tv_gender.setText("Gender: "+user.getGender());
                tv_email.setText("Email: "+user.getEmail());
                tv_dob.setText("Birthday: "+user.getBirthday());


        }
    }
}
