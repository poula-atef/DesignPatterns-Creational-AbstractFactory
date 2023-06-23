package com.mycode.designpatternscreationalabstractfactory;

import com.mycode.designpatternscreationalabstractfactory.factory.FurnitureFactory;
import com.mycode.designpatternscreationalabstractfactory.furniture.chair.Chair;
import com.mycode.designpatternscreationalabstractfactory.furniture.table.Table;

public class AbstractFactoryDesignPattern {
    public static void main(String[] args) {

        String model = "old";
        FurnitureFactory factory = new FurnitureFactory();

        Table table = factory.createTable(model);
        Chair chair = factory.createChair(model);

        // will print Old Table
        System.out.println(table.getTableModel());
        // will print Old Chair
        System.out.println(chair.getChairModel());
    }
}
