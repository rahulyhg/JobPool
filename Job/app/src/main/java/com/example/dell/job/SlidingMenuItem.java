package com.example.dell.job;

/**
 * Created by suraj shakya on 11/5/16.
 * email surajapptech@gmail.com
 */
public class SlidingMenuItem {

    private int imageResource;
    private String menuItemName;

    public SlidingMenuItem(int image, String name) {
        this.imageResource = image;
        this.menuItemName = name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
    }
}
