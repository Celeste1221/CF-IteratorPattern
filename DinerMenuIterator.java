package com.company;

import java.awt.*;
import java.util.ArrayList;

public class DinerMenuIterator implements IIterator {

    //The iterator holds a reference to what it
    //iterates over, and only returns the next item until you have reached the end of the collection.

    //hold a reference to the collection we will iterate
    MenuItem[] menuItems;
    int position = 0;

    //receives type to iterate over and holds that internally
    public DinerMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }

    public DinerMenuIterator() {
    }

    @Override
    public boolean hasNext() {
        //may be at end of list or end of valid items or list could be empty
        if (position>= menuItems.length || menuItems[position] == null){
            return false; //at end of list, no next
        }else{
            return true; //can return next item
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) menuItems[position];
        position++;
        return menuItem;
    }
}
