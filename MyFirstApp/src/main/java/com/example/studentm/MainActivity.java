package com.example.studentm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.media.CamcorderProfile.get;


public class MainActivity extends Activity {

    ArrayList<ClassItem> classList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getClassData();
        ClassAdapter adapter = new ClassAdapter(MainActivity.this,R.layout.class_item, classList);
        ListView listview = (ListView)findViewById(R.id.classList);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            ClassItem classitem =  classList.get(position);
                Intent intent = new Intent(MainActivity.this,StudentsActivity.class);
                intent.putExtra("class",classitem.getName());
                startActivity(intent);

                //Toast.makeText(MainActivity.this,"hello",Toast.LENGTH_LONG).show();
            }
        });

    }

    public ArrayList<ClassItem> getClassData() {
        for (int i = 0; i < 50; i++) {

            classList.add(new ClassItem("this is "+i+" class",R.mipmap.ic_launcher));
        }
        return classList;
    }




}
