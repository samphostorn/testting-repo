package com.example.ui_control;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;



public class ImageViewActivity extends AppCompatActivity {


    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        img=findViewById(R.id.image_view);

//        Glide.with(this).
//                load("https://fidoalliance.org/wp-content/uploads/2019/02/Android_greenrobot-01_aRFK1TB.max-2800x2800.png")
//                .into(img);
////        Glide.with(this,)
        Picasso.get().load("https://fidoalliance.org/wp-content/uploads/2019/02/Android_greenrobot-01_aRFK1TB.max-2800x2800.png").into(img);

    }
}
