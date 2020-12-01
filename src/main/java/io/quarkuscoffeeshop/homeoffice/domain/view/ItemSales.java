package io.quarkuscoffeeshop.homeoffice.domain.view;

import io.quarkuscoffeeshop.homeoffice.domain.Item;

import java.math.BigDecimal;
import java.util.Date;

public class ItemSales {

    Item item;

    Date date;

    long sales;

    BigDecimal revenue;

    public ItemSales(Item item, Date date, long sales, BigDecimal revenue) {
        this.item = item;
        this.date = date;
        this.sales = sales;
        this.revenue = revenue;
    }
}
