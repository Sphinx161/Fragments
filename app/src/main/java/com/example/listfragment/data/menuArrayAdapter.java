package com.example.listfragment.data;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listfragment.R;

import java.util.List;

public class menuArrayAdapter extends ArrayAdapter<menu> {
    private Context context;
    private List<menu> menus;
    public menuArrayAdapter(@NonNull Context context, int resource, List<menu> menus) {
        super(context, resource, menus);
        this.context = context;
        this.menus = menus;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        menu Menu = menus.get(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.menu_list,null);

        ImageView imageView = view.findViewById(R.id.menuImage);
        imageView.setImageResource(Menu.getImageResourceId(context));

        TextView textView = view.findViewById(R.id.menu_name);
        textView.setText(Menu.getMenuName());

        return view;


    }
}
