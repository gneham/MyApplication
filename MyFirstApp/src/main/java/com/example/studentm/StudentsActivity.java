package com.example.studentm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;


public class StudentsActivity extends Activity {
    ArrayList<StudentItem> studentItemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

        Intent intent = getIntent();
        String className = intent.getStringExtra("class");

        //获取数据
        getStudentsData(className);
        
        StudentAdapter adapter = new StudentAdapter(StudentsActivity.this,R.layout.student_item, studentItemList);

        ListView listView = (ListView)findViewById(R.id.studentList);

        listView.setAdapter(adapter);
        
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(StudentsActivity.this, "hello", Toast.LENGTH_SHORT).show();

                StudentItem studentItem = studentItemList.get(position);

                Intent intent = new Intent(StudentsActivity.this,SingleStudentActivity.class);
                intent.putExtra("numberId",studentItem.getNumberId());


                startActivity(intent);

            }
        });

    }

    public ArrayList<StudentItem> getStudentsData(String classname) {


        if (classname.equals("2014级") || true){
            for (int i = 0; i < 50; i++) {
                studentItemList.add(new StudentItem("name" + i, R.mipmap.ic_launcher,i));

            }
        }

        return studentItemList;
    }
}
