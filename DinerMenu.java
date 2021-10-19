package com.company;

import java.awt.*;
import java.util.ArrayList;

public class DinerMenu extends DinerMenuIterator  {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    //generate with no params
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        //initialize menu
        addItem("VBLT", "Beets, Lemon, Tots", true, 2.09);
        addItem("BLT", "Bacon, Lettuce, Tomato", false, 2.09);
        addItem("Soup", "Soup of the day", true, 2.09);
        addItem("Hot Dog", "Hot dog sandwich", false, 2.09);
    }

    //takes every piece of information for a new menu item
    public void addItem (String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems > MAX_ITEMS){
            System.err.println("Sorry menu is full");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    @Override
    public IIterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
