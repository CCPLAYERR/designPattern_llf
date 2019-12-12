package com.designPattern.iterator_menu.menus;

import com.designPattern.iterator_menu.item.MenuItem;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu( ) {
        menuItems = new ArrayList();

        addItem("ak47的早餐店菜单","油条豆浆",true,3.5);
        addItem("m4A4的早餐店菜单","鸡蛋白开水",false,3.0);
        addItem("awp的早餐店菜单","江西拌面",true,6.0);
        addItem("p90的早餐店菜单","福鼎肉片",false,8.0);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }
}
