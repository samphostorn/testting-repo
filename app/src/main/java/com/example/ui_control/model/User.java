package com.example.ui_control.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;

import java.security.PrivateKey;

public class User implements Parcelable {
    private String name;
    private String password;
    private String first_name;
    private String last_name;
    private String new_password;
    private String email;
    private String gender;
    private String birthday;

    protected User(Parcel in) {
      name=in.readString();
      password=in.readString();
      first_name=in.readString();
      last_name=in.readString();
      new_password=in.readString();
      email=in.readString();
      gender=in.readString();

      birthday=in.readString();

    }

   public User(){

    }
    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNew_password() {
        return new_password;
    }

    public void setNew_password(String new_password) {
        this.new_password = new_password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(password);
        dest.writeString(first_name);
        dest.writeString(last_name);
        dest.writeString(new_password);
        dest.writeString(email);
        dest.writeString(gender);

        dest.writeString(birthday);


    }
}
