package com.example.studentm;

/**
 * Created by 马衡 on 2016/12/3.
 */

public class StudentItem {
    String name;
    int imageId;
    int numberId;
    public StudentItem(String name, int imageId,int numberId){
        this.name = name;
        this.imageId = imageId;
        this.numberId = numberId;
    }

    public int getNumberId() {
        return numberId;
    }

    public void setNumberId(int numberId) {
        this.numberId = numberId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setName(String name) {
        this.name = name;

    }
}
