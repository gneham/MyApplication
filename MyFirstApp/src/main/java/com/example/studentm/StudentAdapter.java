package com.example.studentm;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 马衡 on 2016/12/3.
 */

public class StudentAdapter  extends ArrayAdapter<StudentItem>{

    private int resourceId;

    public StudentAdapter(Context context, int resource, List<StudentItem> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        StudentItem studentitem = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        ImageView imageview = (ImageView)view.findViewById(R.id.student_image);
        TextView textview = (TextView)view.findViewById(R.id.student_text);
        imageview.setImageResource(studentitem.getImageId());
        textview.setText(studentitem.getName());
        return view;

    }
}
