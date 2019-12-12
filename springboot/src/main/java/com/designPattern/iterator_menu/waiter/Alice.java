package com.designPattern.iterator_menu.waiter;

import com.designPattern.iterator_menu.item.MenuItem;
import com.designPattern.iterator_menu.menus.DinerMenu;
import com.designPattern.iterator_menu.menus.PancakeHouseMenu;

import java.util.ArrayList;
import java.util.Iterator;

public class Alice {
    //打印菜单
    public void printMenu() {
        //早餐
        ArrayList items_list = new PancakeHouseMenu().getMenuItems();
        Iterator iterator_list = items_list.iterator();
        iterator_menu(iterator_list);

        Iterator iterator_arr = new DinerMenu().createIterator();
        iterator_menu(iterator_arr);


    }

    //只打印早餐
    public void printOnlyBreakfastMenu() {
    }

    //只打印午餐
    public void printOnlyLunchMenu() {
    }

    //只打印素餐
    public void printOnlyVegertarianMenu() {
    }

    //判断是否素餐
    public boolean printIsVegertarian(String name) {
        return false;
    }

    private void iterator_menu(Iterator iterator_) {
        while (iterator_.hasNext()) {
            MenuItem item = (MenuItem) iterator_.next();
            String name = item.getName();
            double price = item.getPrice();
            String description = item.getDescription();
            System.out.println(name + " " + price + " " + description);
        }
    }
}
