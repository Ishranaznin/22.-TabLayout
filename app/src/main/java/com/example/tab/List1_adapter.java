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

public class List1_adapter extends RecyclerView.Adapter<List1_adapter.List1Viewholder> {

    private ArrayList<String> nameList1=new ArrayList<>();
    private ArrayList<Integer>imgList1=new ArrayList<>();

    public List1_adapter(ArrayList<String> nameList1, ArrayList<Integer> imgList1, ArrayList<String> sizeList1, Context context) {
        this.nameList1 = nameList1;
        this.imgList1 = imgList1;
        this.sizeList1 = sizeList1;
        this.context = context;
    }

    private ArrayList<String>sizeList1=new ArrayList<>();
Context context;

    @NonNull
    @Override
    public List1Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        return  (new List1Viewholder( LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler1item, parent, false)));



    }

    @Override
    public void onBindViewHolder(@NonNull List1Viewholder holder, int position) {
        holder.imageName.setText(nameList1.get(position));
        holder.imageSize.setText(sizeList1.get(position));
        Glide.with(context)
                .asBitmap()
                .load(imgList1.get(position))
                .into(holder.image);

    }

    @Override
    public int getItemCount() {
        return nameList1.size();
    }

    public class List1Viewholder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView imageName;
        TextView imageSize;


        public List1Viewholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.recycler1image);
            imageName=itemView.findViewById(R.id.recycler1text1);
            imageSize=itemView.findViewById(R.id.recycler1text2);
        }
    }
}
