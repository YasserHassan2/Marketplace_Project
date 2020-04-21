package com.example.e_comerce_project.ui.Main;

import android.content.Context;


import com.example.e_comerce_project.R;
import com.example.e_comerce_project.ui.Model.AdvertizeModel;
import com.example.e_comerce_project.ui.Model.Category;
import com.example.e_comerce_project.ui.Model.Featured;
import com.example.e_comerce_project.ui.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class MainPresenter {
    MainView view;
    Context context;

    public MainPresenter(MainView view) {
        this.view = view;
    }

    public List<AdvertizeModel> GetAdvertizeFromDatabase()
    {
        AdvertizeModel advertizeModel = new AdvertizeModel("BROWSE OUR\nCLOUTHS COLLECTION", R.drawable.manmodel);
        AdvertizeModel advertizeModel2 = new AdvertizeModel("SALE\n20 OFF", R.drawable.modelwomen);
        AdvertizeModel advertizeModel3 = new AdvertizeModel("GREAT SALE\nDEVICES", R.drawable.iphon);
        AdvertizeModel advertizeModel4 = new AdvertizeModel("BRANDS\nIKEA , DOMIAT", R.drawable.furnuture);

        List<AdvertizeModel> advertizeModelList = new ArrayList<AdvertizeModel>();
        advertizeModelList.add(advertizeModel);
        advertizeModelList.add(advertizeModel2);
        advertizeModelList.add(advertizeModel3);
        advertizeModelList.add(advertizeModel4);

        return advertizeModelList;
    }
    public List<Featured> GetFeaturedFromDatabase()
    {
        Featured featured1 = new Featured("Macdonals","Ai Klam Kter,Ai Klam KterAi Klam KterAi Klam KterAi Klam KterAi Klam KterAi Klam Kter",R.drawable.manmodel);
        Featured featured2 = new Featured("Hybar One","Ai Klam Kter,Ai Klam KterAi Klam KterAi Klam KterAi Klam KterAi Klam KterAi Klam Kter",R.drawable.modelwomen);
        Featured featured3 = new Featured("City Stars","Ai Klam Kter,Ai Klam KterAi Klam KterAi Klam KterAi Klam KterAi Klam KterAi Klam Kter",R.drawable.iphon);
        Featured featured4 = new Featured("City Center","Ai Klam Kter,Ai Klam KterAi Klam KterAi Klam KterAi Klam KterAi Klam KterAi Klam Kter",R.drawable.furnuture);

        List<Featured> featuredList = new ArrayList<Featured>();
        featuredList.add(featured1);
        featuredList.add(featured2);
        featuredList.add(featured3);
        featuredList.add(featured4);

        return featuredList;
    }
    public List<Product> GeMostViewedFromDatabase()
    {
        Product product = new Product(R.drawable.modelwomen,"Cardegn","Ai Klam Kter,Ai Klam KterAi Klam KterAi Klam KterAi Klam KterAi Klam KterAi Klam Kter");
        Product product1 = new Product(R.drawable.manmodel,"T-Shirt","Ai Klam Kter,Ai Klam KterAi Klam KterAi Klam KterAi Klam KterAi Klam KterAi Klam Kter");
        Product product2 = new Product(R.drawable.iphon,"Mobile","Ai Klam Kter,Ai Klam KterAi Klam KterAi Klam KterAi Klam KterAi Klam KterAi Klam Kter");
        Product product3 = new Product(R.drawable.furnuture,"Asas","Ai Klam Kter,Ai Klam KterAi Klam KterAi Klam KterAi Klam KterAi Klam KterAi Klam Kter");

        List<Product> productList = new ArrayList<Product>();
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        return productList;
    }
    public List<Category> GetCategoriesFromDatabase()
    {
        Category category = new Category("Accessories",R.drawable.accessories);
        Category category1 = new Category("Clothes",R.drawable.sweater);
        Category category2 = new Category("Mobiles",R.drawable.mobile);
        Category category3 = new Category("Deals",R.drawable.deals);

        List<Category> categoryList = new ArrayList<Category>();
        categoryList.add(category);
        categoryList.add(category1);
        categoryList.add(category2);
        categoryList.add(category3);

        return categoryList;
    }


    public void getAdvertize(){
        view.onGetAdvertize(GetAdvertizeFromDatabase());
    }
    public void getFeatured(){ view.onFeatured(GetFeaturedFromDatabase());
    }
    public void getMostViewd(){
        view.onMostViewed(GeMostViewedFromDatabase());
    }
    public void getCategories(){
        view.onCategories(GetCategoriesFromDatabase());
    }
}
