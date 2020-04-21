package com.example.e_comerce_project.ui.Main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.e_comerce_project.R;
import com.example.e_comerce_project.ui.Adapters.CategoriesAdapter;
import com.example.e_comerce_project.ui.Adapters.CustomItemClickListener;
import com.example.e_comerce_project.ui.Adapters.FeaturedAdapter;
import com.example.e_comerce_project.ui.Adapters.ProductAdapter;
import com.example.e_comerce_project.ui.Adapters.SliderAdapter;
import com.example.e_comerce_project.ui.Model.AdvertizeModel;
import com.example.e_comerce_project.ui.Model.Category;
import com.example.e_comerce_project.ui.Model.Featured;
import com.example.e_comerce_project.ui.Model.Product;
import com.iammert.library.ui.multisearchviewlib.MultiSearchView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {

    SliderView sliderView;
    private SliderAdapter adapter;
    MainPresenter mainPresenter;
    private FeaturedAdapter featuredAdapter;
    private ProductAdapter productAdapter;
    private CategoriesAdapter categoriesAdapter;
    RecyclerView recyclerView,recyclerView_mostViewd,recyclerView_categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main_desgin);
        recyclerView = findViewById(R.id.recyclerView2);
        recyclerView_mostViewd = findViewById(R.id.recyclerView_mostViewd);
        recyclerView_categories = findViewById(R.id.recyclerView_categories);
        mainPresenter = new MainPresenter(this);
        mainPresenter.getAdvertize();
        mainPresenter.getFeatured();
        mainPresenter.getCategories();
        mainPresenter.getMostViewd();


    }

    @Override
    public void onGetAdvertize(List<AdvertizeModel> advertizeModels) {



    }

    @Override
    public void onFeatured(List<Featured> featuredList) {
        featuredAdapter = new FeaturedAdapter(this,featuredList);
        //horizontal recyclerView orign
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(featuredAdapter);

        featuredAdapter.setOnItemClickListener(new CustomItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public void onCategories(List<Category> categoryList) {
        categoriesAdapter = new CategoriesAdapter(this,categoryList);
        //horizontal recyclerView orign
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView_categories.setLayoutManager(layoutManager);
        recyclerView_categories.setAdapter(categoriesAdapter);

        featuredAdapter.setOnItemClickListener(new CustomItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public void onMostViewed(List<Product> productList) {
        productAdapter = new ProductAdapter(this,productList);
        //horizontal recyclerView orign
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView_mostViewd.setLayoutManager(layoutManager);
        recyclerView_mostViewd.setAdapter(productAdapter);

        featuredAdapter.setOnItemClickListener(new CustomItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
