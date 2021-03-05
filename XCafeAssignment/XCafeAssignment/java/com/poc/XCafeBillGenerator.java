package com.poc;

import com.poc.model.BillAmount;
import com.poc.model.Item;

import java.util.ArrayList;
import java.util.List;

public class XCafeBillGenerator {
    public static void main(String args[]) {
        BillGenerationUtil billGenerationUtil = new BillGenerationUtil();
        // List of items
        List<Item> foodOrdered = new ArrayList<Item>();
        Item item1 = new Item("Cola - cold", 0.54,Item.CategoryType.DRINK.name());
        Item item2 = new Item("Coffee - Hot", 1.00, Item.CategoryType.DRINK.name());
        Item item3 = new Item("Cheese Sandwich - Cold", 2.00, Item.CategoryType.DRINK.name());
        Item item4 = new Item("Steak Sandwich - Hot", 4.50, Item.CategoryType.FOOD.name());

        foodOrdered.add(item1);
        foodOrdered.add(item2);
        foodOrdered.add(item3);
        foodOrdered.add(item4);

        BillAmount billAmount = billGenerationUtil.calculateAmounts(foodOrdered);

        System.out.println("XCafe Bill Generation");

        foodOrdered.stream().forEach((k) -> {
            System.out.println(k.toString());
        });
        System.out.println("Items Price Total :"+billAmount.getTotal());
        System.out.println("Service Charge :"+billAmount.getServiceCharge());
        System.out.println("Total Bill :"+billAmount.getTotalBill());
    }
}
