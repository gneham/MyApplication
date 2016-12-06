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
public class ClassAdapter extends ArrayAdapter<ClassItem> {
    private int resourceId;

    public ClassAdapter(Context context, int resource, List<ClassItem> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ClassItem classitem = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        ImageView imageview = (ImageView)view.findViewById(R.id.class_image);
        TextView textview = (TextView)view.findViewById(R.id.class_text);
        imageview.setImageResource(classitem.getImageId());
        textview.setText(classitem.getName());
        return view;

    }
}
