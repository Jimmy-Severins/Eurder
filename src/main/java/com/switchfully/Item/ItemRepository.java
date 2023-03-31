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
    public List<Item> getAllItems() {
        return itemList;
    }
    public Item updateItem(Item item) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getName().equals(item.getName())) {
                itemList.set(i, item);
                return item;
            }
        }
        return null;
    }
}
