package com.example.e_comerce_project.ui.Main;

import com.example.e_comerce_project.ui.Model.AdvertizeModel;
import com.example.e_comerce_project.ui.Model.Category;
import com.example.e_comerce_project.ui.Model.Featured;
import com.example.e_comerce_project.ui.Model.Product;

import java.util.List;

public interface MainView {

    void onGetAdvertize(List<AdvertizeModel> advertizeModels);
    void onFeatured(List<Featured> featuredList);
    void onCategories(List<Category> categoryList);
    void onMostViewed(List<Product> productList);
}
