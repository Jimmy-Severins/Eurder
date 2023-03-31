package com.switchfully.Item;

import com.switchfully.Item.CreateItemDTO;
import com.switchfully.Item.Item;
import com.switchfully.Item.ItemMapper;
import com.switchfully.Item.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    public final ItemRepository itemRepository;
    public final ItemMapper itemMapper;

    public ItemService(ItemRepository itemRepository, ItemMapper itemMapper) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
    }

    public Item addItem(CreateItemDTO createItemDTO) {
        Item item = itemMapper.mapToItem(createItemDTO);
        return itemRepository.addItem(item);
    }

    public List<Item> getAllItems() {
        return itemRepository.getAllItems();
    }
}
