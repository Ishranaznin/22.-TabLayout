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

public class List3_adapter extends RecyclerView.Adapter<List3_adapter.List3Viewholder> {
    Context context;
    private ArrayList<String> name=new ArrayList<>();
    private ArrayList<Integer>img=new ArrayList<>();

    public List3_adapter(Context context, ArrayList<String> name, ArrayList<Integer> img, ArrayList<String> size) {
        this.context = context;
        this.name = name;
        this.img = img;
        this.size = size;
    }

    private ArrayList<String>size=new ArrayList<>();

    @NonNull
    @Override
    public List3Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        return  (new List3Viewholder( LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler3item, parent, false)));



    }

    @Override
    public void onBindViewHolder(@NonNull List3Viewholder holder, int position) {
        holder.imageName.setText(name.get(position));
        holder.imageSize.setText(size.get(position));
        Glide.with(context)
                .asBitmap()
                .load(img.get(position))
                .into(holder.image);

    }

    @Override
    public int getItemCount() {
        return name.size();
    }

    public class List3Viewholder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView imageName;
        TextView imageSize;


        public List3Viewholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.recycler3image);
            imageName=itemView.findViewById(R.id.recycler3text1);
            imageSize=itemView.findViewById(R.id.recycler3text2);
        }
    }
}
