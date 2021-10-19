package com.company;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class WaiterBot {

    IMenu pancakeHouseMenu;
    IMenu dinerMenu;


    public WaiterBot(IMenu pancakeHouseMenu, IMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;

    }

    public void printMenu(){
        printBreakfastMenu();
        printLunchMenu();
    }

    private void printBreakfastMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
        for(int i=0; i< breakfastItems.size(); i++){
            MenuItem menuItem = (MenuItem) breakfastItems.get(i);
            System.out.println(menuItem.getName());
        }
    }

    private void printLunchMenu() {
        DinerMenu dinerMenu = new DinerMenu();
        IIterator dinerIterator = dinerMenu.createIterator();
        while(dinerIterator.hasNext()){
            MenuItem currItem = (MenuItem)dinerIterator.next();
            System.out.println(currItem.getName());
        }
    }

    public boolean isVegetarian(MenuItem menuItem){
        return menuItem.isVegetarian();
    }

    public void vegetarianMenu(){
        //homework
    }

}
