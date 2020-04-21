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
import com.example.e_comerce_project.ui.Model.Featured;

import java.util.List;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.RecyclerViewHolders>{

    private List<Featured> FeaturedList;
    private Context context;
    CustomItemClickListener listener;
    public FeaturedAdapter(Context context, List<Featured> FeaturedList) {
        this.FeaturedList = FeaturedList;
        this.context = context;
    }

    @Override
    public FeaturedAdapter.RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_item, parent,false);
        final FeaturedAdapter.RecyclerViewHolders holder = new FeaturedAdapter.RecyclerViewHolders(layoutView);
        layoutView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(v, holder.getPosition());

            }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(FeaturedAdapter.RecyclerViewHolders holder, int position) {

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background);

        Glide.with(context)
                .load(FeaturedList.get(position).getImg_path())
                .apply(requestOptions)
                .into(holder.FeaturedImage);

        holder.FeaturedName.setText(FeaturedList.get(position).getTitle());
        holder.FeaturedDesc.setText(FeaturedList.get(position).getDesc());

    }


    //Set method of OnItemClickListener object
    public void setOnItemClickListener(CustomItemClickListener recyclerViewItemClickListner) {
        this.listener = recyclerViewItemClickListner;
    }


    @Override
    public int getItemCount() {
        return this.FeaturedList.size();
    }

    public class RecyclerViewHolders extends RecyclerView.ViewHolder {

        /**
         * this class contains onclick listener for the recylcer view home
         */

        public TextView FeaturedName,FeaturedDesc,Featuredprice;
        public ImageView FeaturedImage;
        public int position = 0;

        public RecyclerViewHolders(View itemView) {
            super(itemView);
            FeaturedName = (TextView) itemView.findViewById(R.id.title_featured);
            FeaturedDesc = (TextView) itemView.findViewById(R.id.desc_featured);
            FeaturedImage = (ImageView) itemView.findViewById(R.id.image_faetured);


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
