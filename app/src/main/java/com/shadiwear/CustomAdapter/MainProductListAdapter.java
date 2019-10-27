package com.shadiwear.CustomAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shadiwear.Models.MainProductListModel;
import com.shadiwear.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainProductListAdapter extends RecyclerView.Adapter<MainProductListAdapter.MainProductListHolder> {

    private Context context;
    private ArrayList<MainProductListModel> productList;

    public MainProductListAdapter(Context context, ArrayList<MainProductListModel> productList) {
        this.productList = productList;
        this.context = context;
    }

    @Override
    public MainProductListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_product_list_view_row, parent, false);

        return new MainProductListHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MainProductListHolder holder, final int position) {

        MainProductListModel productListModel = productList.get(position);

        Picasso.with(context).load(productListModel.getProduct_cover_image()).into(holder.ivProductImage);
        holder.tvProductName.setText(productListModel.getProduct_name());
        holder.tvProductCity.setText(productListModel.getProduct_city());
        holder.tvProductRent.setText("1000");

        holder.tvProductName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Product name : " + productList.get(position).getProduct_name(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class MainProductListHolder extends RecyclerView.ViewHolder {
        public ImageView ivProductImage;
        public TextView tvProductName, tvProductCity, tvProductRent;

        public MainProductListHolder(View itemView) {
            super(itemView);

            ivProductImage = itemView.findViewById(R.id.iv_product_image);
            tvProductName = itemView.findViewById(R.id.tv_product_name);
            tvProductCity = itemView.findViewById(R.id.tv_product_city);
            tvProductRent = itemView.findViewById(R.id.tv_product_rent);
        }
    }

//    public void setProductList(ArrayList<MainProductListModel> productList){
//        this.productList = productList;
//        notifyDataSetChanged();
//    }
}
