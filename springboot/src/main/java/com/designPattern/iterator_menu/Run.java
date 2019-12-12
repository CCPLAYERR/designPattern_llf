package com.designPattern.iterator_menu;

import com.designPattern.iterator_menu.waiter.Alice;

public class Run {
    public static void main(String[] args) {
        Alice alice = new Alice();
//        System.out.println(alice);
        alice.printMenu();
    }
}
