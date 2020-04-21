package com.example.e_comerce_project.ui.Model;

public class Category {
    String id,title;
    int img_path;

    public Category(String title, int img_path) {
        this.title = title;
        this.img_path = img_path;
    }

    public Category(String id, String title, int img_path) {
        this.id = id;
        this.title = title;
        this.img_path = img_path;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImg_path() {
        return img_path;
    }

    public void setImg_path(int img_path) {
        this.img_path = img_path;
    }
}
