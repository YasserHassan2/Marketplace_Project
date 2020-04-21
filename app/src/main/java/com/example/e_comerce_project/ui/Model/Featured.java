package com.example.e_comerce_project.ui.Model;

public class Featured {
    String id,title,desc;
    int img_path;

    public Featured(String id, String title, String desc, int img_path) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.img_path = img_path;
    }

    public Featured(String title, String desc, int img_path) {
        this.title = title;
        this.desc = desc;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImg_path() {
        return img_path;
    }

    public void setImg_path(int img_path) {
        this.img_path = img_path;
    }
}
