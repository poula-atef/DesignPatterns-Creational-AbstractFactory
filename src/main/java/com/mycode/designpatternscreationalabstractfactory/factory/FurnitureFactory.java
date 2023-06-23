package com.mycode.designpatternscreationalabstractfactory.factory;

import com.mycode.designpatternscreationalabstractfactory.furniture.chair.Chair;
import com.mycode.designpatternscreationalabstractfactory.furniture.chair.NewChair;
import com.mycode.designpatternscreationalabstractfactory.furniture.chair.OldChair;
import com.mycode.designpatternscreationalabstractfactory.furniture.table.NewTable;
import com.mycode.designpatternscreationalabstractfactory.furniture.table.OldTable;
import com.mycode.designpatternscreationalabstractfactory.furniture.table.Table;

public class FurnitureFactory {

    public Chair createChair(String model) {
        switch (model) {
            case "old":
                return new OldChair();
            case "new":
                return new NewChair();
            default:
                return null;
        }
    }

    public Table createTable(String model) {
        switch (model) {
            case "old":
                return new OldTable();
            case "new":
                return new NewTable();
            default:
                return null;
        }
    }

}
