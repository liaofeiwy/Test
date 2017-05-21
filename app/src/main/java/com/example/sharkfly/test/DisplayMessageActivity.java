package com.example.sharkfly.test;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * This project is to realize the basic functions by Android Studio
 * Project: NewTest
 * Version:1.0
 * Created by S. LIAO on 2017-05-20.
 */
public class DisplayMessageActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent=getIntent();
        String message=intent.getStringExtra("EXTRA_MESSAGE");
        TextView textView=(TextView)findViewById(R.id.tvShow);
        textView.setText(message);//Set text into message
    }
}
