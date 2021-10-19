package com.company;

public class PancakeHouseMenuIterator implements IIterator{
    //The iterator holds a reference to what it
    //iterates over, and only returns the next item until you have reached the end of the collection.

    //hold a reference to the collection we will iterate
    MenuItem[] menuItems;
    int position = 0;

    //receives type to iterate over and holds that internally
    public PancakeHouseMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
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
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
