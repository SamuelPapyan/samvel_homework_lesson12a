package com.example.samvel_homework_lesson_12a.pictrix;

import java.util.ArrayList;

public class Image {
    private static String[] imageUrls = {
            "https://img.freepik.com/free-photo/this-is-beautiful-landscape-emerald-lake-canada-s-youhe-national-park_361746-26.jpg?size=626&ext=jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Beautiful-landscape.png/800px-Beautiful-landscape.png",
            "https://m.media-amazon.com/images/I/71UgxcPWW3L._AC_SL1000_.jpg",
            "https://wallscloud.net/uploads/cache/627289375/10000%D1%854558_%D0%BF%D1%80%D0%B8%D1%80%D0%BE%D0%B4%D0%B0-%D0%BF%D0%B0%D0%BD%D0%BE%D1%80%D0%B0%D0%BC%D0%B0-1024x576-MM-90.jpg",
            "https://img2.goodfon.com/wallpaper/nbig/2/dc/beautiful-landscape-scenery.jpg",
            "https://img5.goodfon.ru/wallpaper/nbig/2/3c/gene-raz-von-edler-by-gene-raz-von-edler-vault-of-heaven.jpg",
            "https://diamondpaintingsell.com/wp-content/uploads/2020/07/purple-beautiful-landscape-waterfalls-1.jpg",
            "https://photographycourse.net/wp-content/uploads/2014/11/Landscape-Photography-steps.jpg",
            "https://photographylife.com/wp-content/uploads/2020/03/Dan-Ballard-Landscapes-6.jpg"

    };
    private String profileImage;
    private String profileName;
    private String imageSrc;
    private boolean isLiked;

    public static ArrayList<Image> getItems(){
        ArrayList<Image> list = new ArrayList<>();
        for(String url : imageUrls){
            list.add(new Image(imageUrls[0],"Name Surname", url));
        }
        return list;
    }
    public Image(String profileImage, String profileName, String imageSrc){
        this.imageSrc = imageSrc;
        this.profileImage = profileImage;
        this.profileName = profileName;
        this.isLiked = false;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public String getProfileName() {
        return profileName;
    }

    public boolean getIsLiked(){
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }
}
