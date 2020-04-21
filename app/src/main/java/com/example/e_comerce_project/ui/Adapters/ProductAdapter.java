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
import com.example.e_comerce_project.ui.Model.Product;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.RecyclerViewHolders>{

    private List<Product> ProductList;
    private Context context;
    CustomItemClickListener listener;
    public ProductAdapter(Context context, List<Product> ProductList) {
        this.ProductList = ProductList;
        this.context = context;
    }

    @Override
    public ProductAdapter.RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.most_viewd_item, parent,false);
        final ProductAdapter.RecyclerViewHolders holder = new ProductAdapter.RecyclerViewHolders(layoutView);
        layoutView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(v, holder.getPosition());

            }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(ProductAdapter.RecyclerViewHolders holder, int position) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background);

        Glide.with(context)
                .load(ProductList.get(position).getImage_path())
                .apply(requestOptions)
                .into(holder.ProductImage);

        holder.ProductName.setText(ProductList.get(position).getTitle());
        holder.ProductDesc.setText(ProductList.get(position).getDesc());
    }


    //Set method of OnItemClickListener object
    public void setOnItemClickListener(CustomItemClickListener recyclerViewItemClickListner) {
        this.listener = recyclerViewItemClickListner;
    }


    @Override
    public int getItemCount() {
        return this.ProductList.size();
    }

    public class RecyclerViewHolders extends RecyclerView.ViewHolder {

        /**
         * this class contains onclick listener for the recylcer view home
         */

        public TextView ProductName,ProductDesc,Productprice;
        public ImageView ProductImage;
        public int position = 0;

        public RecyclerViewHolders(View itemView) {
            super(itemView);
            ProductName = (TextView) itemView.findViewById(R.id.title_mostviewd);
            ProductImage = (ImageView) itemView.findViewById(R.id.image_mostviewd);
            ProductDesc =itemView.findViewById(R.id.desc_mostviewd);


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
