package com.example.samvel_homework_lesson_12a;


import java.util.ArrayList;

public class BigItem {
    private String title;
    private int image;
    private String[] items;

    public static ArrayList<BigItem> getBigItems(){
        ArrayList<BigItem> list = new ArrayList<>();
        String[] arts = {"Casinos","Art Galleries","Comedy Clubs","Movie Theaters","Museums","Dance Studios"};
        String[] autos = {"Car Dealership", "Car Rental Companies", "Car Repair Shoes","Car Washes", "Car Accessories"};
        String[] comms = {};
        list.add(new BigItem("Arts & Entertainment",R.drawable.orange_brush,arts));
        list.add(new BigItem("Automotive",R.drawable.car_blue,autos));
        list.add(new BigItem("Communals & Government",R.drawable.bank_pink,comms));
        return list;
    }

    public BigItem(String title, int image, String[] items){
        this.title = title;
        this.image = image;
        this.items = items;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String[] getItems() {
        return items;
    }
}
