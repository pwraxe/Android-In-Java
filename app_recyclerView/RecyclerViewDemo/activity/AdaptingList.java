package com.example.recyclerviewdemo;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdaptingList extends RecyclerView.Adapter<AdaptingList.progListViewHolder>
{

    private String[] data;
    private int[] price;
    AdaptingList(String[] data,int[] price)
    {
        this.data = data;
        this.price = price;
    }
    @NonNull
    @Override
    public progListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.list_item,viewGroup,false);
        return new progListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull progListViewHolder progListViewHolder, int i) {
        String textview = data[i];
        int valu = price[i];

        progListViewHolder.textTitle.setText(textview+"");
        progListViewHolder.textValue.setText(valu+"");

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    class progListViewHolder extends RecyclerView.ViewHolder{

        ImageView imgIcon;
        TextView textTitle,textValue;

        private progListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgitem);
            textTitle = itemView.findViewById(R.id.textItem);
            textValue = itemView.findViewById(R.id.values);
        }
    }
}
