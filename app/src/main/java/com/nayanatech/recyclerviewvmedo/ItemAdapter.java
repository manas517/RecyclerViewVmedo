package com.nayanatech.recyclerviewvmedo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    ArrayList<ItemModel> itemModelArrayList;

    public ItemAdapter(ArrayList<ItemModel> itemModelArrayList) {
        this.itemModelArrayList = itemModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
       ItemModel itemModel=itemModelArrayList.get(position);
       viewHolder.logo_img.setImageResource(itemModel.getLogo_Image());
       viewHolder.logo_tv.setText(itemModel.getLogo_name());
       viewHolder.time_tv.setText(itemModel.getTime());
       viewHolder.desc_tv.setText(itemModel.getDesc());
       viewHolder.orange_img.setImageResource(itemModel.getOrange_Image());
       viewHolder.like_update_tv.setText(itemModel.getLike_Update());
       viewHolder.like_img.setImageResource(itemModel.getLike_image());
        viewHolder.like_wd_btn_tv.setText(itemModel.getLike_wd_btn());
        viewHolder.share_img.setImageResource(itemModel.getShare_image());
        viewHolder.share_wd_btn_tv.setText(itemModel.getShare_wd_btn());






    }

    @Override
    public int getItemCount() {
        return itemModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logo_img,orange_img,like_img,share_img;
        TextView logo_tv,time_tv,desc_tv,like_update_tv,like_wd_btn_tv,share_wd_btn_tv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logo_img=itemView.findViewById(R.id.logo_imageView);
            orange_img=itemView.findViewById(R.id.orange_ImageView);
            like_img=itemView.findViewById(R.id.like_btn_imageView);
            share_img=itemView.findViewById(R.id.share_btn_imageView);
            logo_tv=itemView.findViewById(R.id.logo_textView);
            time_tv=itemView.findViewById(R.id.time_TextView);
            desc_tv=itemView.findViewById(R.id.desc_textView);
            like_update_tv=itemView.findViewById(R.id.likes_update_TextView);
            like_wd_btn_tv=itemView.findViewById(R.id.likes_TextView);
            share_wd_btn_tv=itemView.findViewById(R.id.share_TextView);
        }
    }
}
