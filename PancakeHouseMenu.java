package com.company;

import java.util.ArrayList;

public class PancakeHouseMenu extends PancakeHouseMenuIterator{

    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("ET Pancakes", "Eggs, Toast, Pancakes", true, 2.09);
        addItem("Pancakes", "Pancakes", true, 2.09);
        addItem("ET", "Eggs and Toast", true, 2.09);
        addItem("Waffles", "Lumpy Pancakes", true, 2.09);
    }

    //takes every piece of information for a new menu item
    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public IIterator createIterator(){
        return null;
    }
}
