package com.switchfully.Item;

import com.switchfully.Item.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemRepository {
public List<Item> itemList;
    public ItemRepository() {
        this.itemList = new ArrayList<>();
    }
    public Item addItem(Item item) {
        itemList.add(item);
        return item;
    }

}
