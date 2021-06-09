package com.example.tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Fragment1 extends Fragment {
    RecyclerView rview1, rview2, rview3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment1, container, false);


        rview1 = v.findViewById(R.id.recycler1);

        rview2 = v.findViewById(R.id.recucler2);

        rview3 = v.findViewById(R.id.recucler3);
        recyclee1task();
      recycler2task();
        recycler3task();
        return v;
    }

    private void recyclee1task() {
        ArrayList<String> nameList1 = new ArrayList<>();
        ArrayList<Integer> imgList1 = new ArrayList<>();
        ArrayList<String> sizeList1 = new ArrayList<>();
        rview1.setHasFixedSize(true);
        rview1.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        List1_adapter adapter = new List1_adapter(nameList1, imgList1, sizeList1, getContext());
        rview1.setAdapter(adapter);
        nameList1.add("imo HD-Free Video Calls and Chats");
        imgList1.add(R.drawable.imo);
        sizeList1.add("28MB");

        nameList1.add("Instagram");
        imgList1.add(R.drawable.instragran);
        sizeList1.add("33MB");

        nameList1.add("Snapchat");
        imgList1.add(R.drawable.snapchat);
        sizeList1.add("52MB");

        nameList1.add("You Tube");
        imgList1.add(R.drawable.youtube);
        sizeList1.add("38MB");
    }


    private void recycler2task() {
        ArrayList<String> nameList2 = new ArrayList<>();
        ArrayList<Integer> imgList2 = new ArrayList<>();
        ArrayList<String> sizeList2 = new ArrayList<>();
        rview2.setHasFixedSize(true);
        rview2.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        List2adapter adapter2 = new List2adapter(getContext(), nameList2, imgList2, sizeList2);
        rview2.setAdapter(adapter2);
        nameList2.add("Like-Let You Shine");
        imgList2.add(R.drawable.likee);
        sizeList2.add("59MB");

        nameList2.add("foodPanda_Local Food & Grocerery");
        imgList2.add(R.drawable.foodpanda);
        sizeList2.add("17MB");

        nameList2.add("Alibaba.com");
        imgList2.add(R.drawable.alibaba);
        sizeList2.add("75MB");

        nameList2.add("Daraz");
        imgList2.add(R.drawable.daraz);
        sizeList2.add("47MB");

        nameList2.add("MyGp-Free internet, Recharge");
        imgList2.add(R.drawable.mygp);
        sizeList2.add("15MB");
    }

    private void recycler3task() {
        ArrayList<String> nameList3 = new ArrayList<>();
        ArrayList<Integer> imgList3 = new ArrayList<>();
        ArrayList<String> sizeList3 = new ArrayList<>();
        rview3.setHasFixedSize(true);
        rview3.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        List3_adapter adapter3 = new List3_adapter(getContext(), nameList3, imgList3, sizeList3);
        rview3.setAdapter(adapter3);
        nameList3.add("sleepa");
        imgList3.add(R.drawable.sleepa);
        sizeList3.add("49MB");

        nameList3.add("Tv News");
        imgList3.add(R.drawable.tvnews);
        sizeList3.add("10MB");

        nameList3.add("Planty nanny 2");
        imgList3.add(R.drawable.plantnanny2);
        sizeList3.add("55MB");

        nameList3.add("Video Show");
        imgList3.add(R.drawable.videoshpw);
        sizeList3.add("30MB");

        nameList3.add("MyGp-Free internet, Recharge");
        imgList3.add(R.drawable.mygp);
        sizeList3.add("15MB");
    }

}


