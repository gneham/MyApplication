package com.example.studentm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 马衡 on 2016/12/4.
 */

public class SingleStudentActivity  extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singlestudent);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        TextView textView = (TextView)findViewById(R.id.textView);
        Intent intent = getIntent();
        int numberId = intent.getIntExtra("numberId",-1);

        if(numberId==142269||true){

            imageView.setImageResource(R.mipmap.ic_launcher);
            textView.setText("我是");

        }


    }
}
