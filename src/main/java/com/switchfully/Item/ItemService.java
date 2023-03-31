package com.switchfully.Item;

import com.switchfully.Item.CreateItemDTO;
import com.switchfully.Item.Item;
import com.switchfully.Item.ItemMapper;
import com.switchfully.Item.ItemRepository;
import com.switchfully.Order.OrderDTO;
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

    public Item addItemUponCreatingOrder(OrderDTO orderDTO) {
        Item item = itemMapper.mapToItem(orderDTO);
        return itemRepository.addItem(item);
    }

    public List<Item> getAllItems() {
        return itemRepository.getAllItems();
    }

    public Item updateItem(UpdateItemDTO updateItemDTO) {
        Item item = itemMapper.mapToItem(updateItemDTO);
        return itemRepository.updateItem(item);
    }
}
