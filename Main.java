package com.company;

public class Main {

    public static void main(String[] args) {
	WaiterBot waiterBot = new WaiterBot(new PancakeHouseMenu(), new DinerMenu());
    waiterBot.printMenu();
    }
}
