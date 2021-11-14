package com.example.samvel_homework_lesson_12a;

import java.util.ArrayList;

public class Fragment1Item {
    private int image;
    private String text1;
    private String text2;
    private int days;
    private int hours;
    private int minutes;

    public static ArrayList<Fragment1Item> getItems(){
        ArrayList<Fragment1Item> list = new ArrayList<>();
        list.add(new Fragment1Item(R.drawable.android_head_green, "CooperKo","#247:Advanced Ticketing",81,14,44));
        list.add(new Fragment1Item(R.drawable.android_head_green, "Yost,Powlowski and Jenkins","#136:VZ test #136",50,17,44));
        list.add(new Fragment1Item(R.drawable.android_head_green, "Yost,Powlowski and Jenkins","#184:VZ test #184",19,20,44));
        list.add(new Fragment1Item(R.drawable.android_head_green, "CooperKo","#247:Advanced Ticketing",81,14,44));
        list.add(new Fragment1Item(R.drawable.android_head_green, "Yost,Powlowski and Jenkins","#136:VZ test #136",50,17,44));
        list.add(new Fragment1Item(R.drawable.android_head_green, "Yost,Powlowski and Jenkins","#184:VZ test #184",19,20,44));
        return list;
    }

    public Fragment1Item(int image, String text1, String text2, int days, int hours, int minutes){
        this.image = image;
        this.text1 = text1;
        this.text2 = text2;
        this.days = days;
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getImage() {
        return image;
    }

    public int getDays() {
        return days;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}
