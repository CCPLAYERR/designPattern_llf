package com.designPattern.iterator_menu.menus;

import com.designPattern.iterator_menu.item.MenuItem;
import com.designPattern.iterator_menu.iterators.DinerMenuIterator;

import java.util.Iterator;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberofItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("usp.45的午餐店菜单", "西红柿炒蛋", true, 11.5);
        addItem("沙漠之鹰的午餐店菜单", "炒大肠", true, 17.5);
        addItem("glock18的午餐店菜单", "猪肉汤", false, 13.5);
        addItem("p250的午餐店菜单", "清蒸排骨", false, 38.5);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberofItems >= MAX_ITEMS) {
            System.out.println("菜单已满，无法点餐");
        } else {
            menuItems[numberofItems] = menuItem;
            numberofItems += 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
