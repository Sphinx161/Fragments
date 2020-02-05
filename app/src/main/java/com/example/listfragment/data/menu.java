package com.example.listfragment.data;

import android.content.Context;

public class menu {
        private String menuName;
        private String menuImage;

        public int getImageResourceId(Context context){
            return context.getResources().getIdentifier(this.menuImage,"drawable",context.getPackageName());
        }

    public menu(String menuName, String menuImage) {
        this.menuName = menuName;
        this.menuImage = menuImage;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuImage() {
        return menuImage;
    }

    public void setMenuImage(String menuImage) {
        this.menuImage = menuImage;
    }
}
