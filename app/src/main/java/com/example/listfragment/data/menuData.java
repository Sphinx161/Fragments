package com.example.listfragment.data;

import java.util.ArrayList;

public class menuData {
    private String[] menuNames ={"Weather","Email","Music"};
    public ArrayList<menu> menulist() {
        ArrayList<menu> list = new ArrayList<>();

        for (int i=0 ; i<menuNames.length; i++){
            menu Menu = new menu(menuNames[i],menuNames[i].toLowerCase());
            list.add(Menu);


        }
        return list;
    }

}


