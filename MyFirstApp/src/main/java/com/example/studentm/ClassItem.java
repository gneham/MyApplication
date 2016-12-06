package com.example.studentm;

/**
 * Created by 马衡 on 2016/12/3.
 */

public class ClassItem {
    String name;
    int imageId;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {

        return name;
    }

    public ClassItem(String name,int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
