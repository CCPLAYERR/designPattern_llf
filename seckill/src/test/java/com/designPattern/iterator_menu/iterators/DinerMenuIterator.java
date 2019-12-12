package com.designPattern.iterator_menu.iterators;

import java.util.Iterator;

import com.designPattern.iterator_menu.item.MenuItem;

public class DinerMenuIterator implements Iterator {
    int lastRet = 0; // 当前元素的索引 -1表示没有当前元素
    MenuItem[] items;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (lastRet == -1 || lastRet >= items.length || items[lastRet] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem item = null;
        item = items[lastRet];
        lastRet += 1;
        return item;
    }
}
