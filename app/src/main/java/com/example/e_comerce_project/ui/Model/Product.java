package com.example.e_comerce_project.ui.Model;

public class Product {
    int id,image_path;
    double price;
    String title,desc;

    public Product(int image_path, String title, String desc) {
        this.image_path = image_path;
        this.title = title;
        this.desc = desc;
    }

    public Product(int id, int image_path, double price, String title, String desc) {
        this.id = id;
        this.image_path = image_path;
        this.price = price;
        this.title = title;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage_path() {
        return image_path;
    }

    public void setImage_path(int image_path) {
        this.image_path = image_path;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
}
