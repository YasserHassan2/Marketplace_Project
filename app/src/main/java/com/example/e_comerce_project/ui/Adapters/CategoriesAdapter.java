package com.example.e_comerce_project.ui.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.e_comerce_project.R;
import com.example.e_comerce_project.ui.Model.Category;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.RecyclerViewHolders>{

    private List<Category> CategoryList;
    private Context context;
    CustomItemClickListener listener;
    public CategoriesAdapter(Context context, List<Category> CategoryList) {
        this.CategoryList = CategoryList;
        this.context = context;
    }

    @Override
    public CategoriesAdapter.RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_item, parent,false);
        final CategoriesAdapter.RecyclerViewHolders holder = new CategoriesAdapter.RecyclerViewHolders(layoutView);
        layoutView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(v, holder.getPosition());

            }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(CategoriesAdapter.RecyclerViewHolders holder, int position) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background);

        Glide.with(context)
                .load(CategoryList.get(position).getImg_path())
                .apply(requestOptions)
                .into(holder.CategoryImage);

        holder.CategoryName.setText(CategoryList.get(position).getTitle());

    }


    //Set method of OnItemClickListener object
    public void setOnItemClickListener(CustomItemClickListener recyclerViewItemClickListner) {
        this.listener = recyclerViewItemClickListner;
    }


    @Override
    public int getItemCount() {
        return this.CategoryList.size();
    }

    public class RecyclerViewHolders extends RecyclerView.ViewHolder {

        /**
         * this class contains onclick listener for the recylcer view home
         */

        public TextView CategoryName,CategoryDesc,Categoryprice;
        public ImageView CategoryImage;
        public int position = 0;

        public RecyclerViewHolders(View itemView) {
            super(itemView);
            CategoryName = (TextView) itemView.findViewById(R.id.title_cat);
            CategoryImage = (ImageView) itemView.findViewById(R.id.image_cat);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //When item view is clicked, trigger the itemclicklistener
                    //Because that itemclicklistener is indicated in MainActivity
                    listener.onItemClick(v, position);
                }
            });
        }


    }


}
