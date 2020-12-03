package com.example.bottomnavigationview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class FavoriteFragment extends Fragment {

    View v;
    RecyclerView recyclerView;

    List<ModalClass> mList;
    CustomAdapter customAdapter;


    public FavoriteFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_favorite, container, false);

        recyclerView = v.findViewById(R.id.favorite_frag);

        customAdapter = new CustomAdapter(mList, getContext());
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mList = new ArrayList<>();
        mList.add(new ModalClass(R.drawable.naruto, "Naruto Uzumaki"));
        mList.add(new ModalClass(R.drawable.sasuke, "Sasuke Uchiha"));
        mList.add(new ModalClass(R.drawable.sakura, "Sakura Haruno"));
        mList.add(new ModalClass(R.drawable.neji, "Neji Hyuuga"));
        mList.add(new ModalClass(R.drawable.tenten, "Tenten"));
        mList.add(new ModalClass(R.drawable.rocklee, "Rock Lee"));
        mList.add(new ModalClass(R.drawable.kiba, "Kiba Inuzuka"));
        mList.add(new ModalClass(R.drawable.shino, "Shino Aburame"));
        mList.add(new ModalClass(R.drawable.shisui, "Shisui Uchiha"));
        mList.add(new ModalClass(R.drawable.hanabi, "Hanabi Hyuuga"));
        mList.add(new ModalClass(R.drawable.itachi, "Itachi Uchiha"));
        mList.add(new ModalClass(R.drawable.chouji, "Chouji Akimichi"));
        mList.add(new ModalClass(R.drawable.ino, "Ino Yamanaka"));
        mList.add(new ModalClass(R.drawable.nagato, "Nagato Uzumaki"));
        mList.add(new ModalClass(R.drawable.utakata, "Utakata"));

    }
}