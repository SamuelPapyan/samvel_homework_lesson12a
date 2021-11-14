package com.example.samvel_homework_lesson_12a;

import java.util.ArrayList;

public class Fragment2Item {
    private String commentText;

    public static ArrayList<Fragment2Item> getItems(){
        ArrayList<Fragment2Item> list = new ArrayList<>();
        list.add(new Fragment2Item("We couldn't find a tester within 24 hours.We rec..."));
        list.add(new Fragment2Item("We couldn't find a tester within 24 hours.We rec..."));
        list.add(new Fragment2Item("We couldn't find a tester within 24 hours.We rec..."));
        list.add(new Fragment2Item("We couldn't find a tester within 24 hours.We rec..."));
        list.add(new Fragment2Item("We couldn't find a tester within 24 hours.We rec..."));
        list.add(new Fragment2Item("We couldn't find a tester within 24 hours.We rec..."));
        return list;
    }

    public Fragment2Item(String commentText){
        this.commentText = commentText;
    }

    public String getCommentText() {
        return commentText;
    }
}
