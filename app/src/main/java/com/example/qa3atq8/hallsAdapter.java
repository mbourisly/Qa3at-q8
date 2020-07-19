package com.example.qa3atq8;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class hallsAdapter extends RecyclerView.Adapter {

    ArrayList<halls> hArray;
    Context c ;

    public hallsAdapter(ArrayList<halls> hArray, Context c) {
        this.hArray = hArray;
        this.c = c;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.halls_list_item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).img.setImageResource(hArray.get(position).getImage());
        ((ViewHolder)holder).hallname.setText(hArray.get(position).getName());
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(c,halls_details.class);
                i.putExtra("halls",hArray.get(position));
                c.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return hArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img;
        public TextView hallname;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            hallname = itemView.findViewById(R.id.name);
            img = itemView.findViewById(R.id.imageView);
        }
    }
}
