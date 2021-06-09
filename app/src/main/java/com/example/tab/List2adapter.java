package com.example.tab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class List2adapter extends RecyclerView.Adapter<List2adapter.List2ViewHolder> {
    Context mctx;

    public List2adapter(Context mctx, ArrayList<String> name, ArrayList<Integer> img, ArrayList<String> size) {
        this.mctx = mctx;
        this.name = name;
        this.img = img;
        this.size = size;
    }

    ArrayList<String>name;
    ArrayList<Integer>img;
    ArrayList<String>size;

    @NonNull
    @Override
    public List2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return (new List2ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler2item,parent,false)));
    }

    @Override
    public void onBindViewHolder(@NonNull List2ViewHolder holder, int position) {
holder.imageName.setText(name.get(position));
holder.imageSize.setText(size.get(position));
        Glide.with(mctx).asBitmap().load(img.get(position)).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return size.size();
    }

    public class List2ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView imageName;
        TextView imageSize;
        public List2ViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.recycler2image);
            imageName=itemView.findViewById(R.id.recycler2text1);
            imageSize=itemView.findViewById(R.id.recycler2text2);
        }
    }
}
