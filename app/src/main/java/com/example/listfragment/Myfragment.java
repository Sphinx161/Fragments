package com.example.listfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import com.example.listfragment.data.menu;
import com.example.listfragment.data.menuArrayAdapter;
import com.example.listfragment.data.menuData;

import java.util.List;


public class Myfragment extends ListFragment {
    List<menu> menus = new menuData().menulist();
    public Myfragment(){
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        menuArrayAdapter adapter = new menuArrayAdapter(getActivity(),
                R.layout.menu_list ,menus);
        setListAdapter(adapter);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_fragment,container,false);
        return  view;
    }
}
