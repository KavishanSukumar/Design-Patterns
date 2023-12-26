package org.mylearnings.proxypattern;

import java.util.Hashtable;

public class Warehouse implements IOrder{
    private Hashtable<String,Integer> stock;
    private String address;

    @Override
    public void fulfullOrder(Order order) {
        for(Item item:order.itemList)
            this.stock.replace(item.sku,stock.get(item)-1);
    }
    public int currentInventory(Item item){
        if(stock.containsKey(item.sku))
            return stock.get(item.sku);
        return 0;
    }
}
