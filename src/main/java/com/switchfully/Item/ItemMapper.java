package com.switchfully.Item;

import com.switchfully.Item.CreateItemDTO;
import com.switchfully.Item.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {

    public Item mapToItem(CreateItemDTO createItemDTO) {
        return new Item(createItemDTO.getName(), createItemDTO.getDescription(), createItemDTO.getPrice(), createItemDTO.getStockAmount());
    }

    public CreateItemDTO mapToCreateItemDTO(Item item) {
        return new CreateItemDTO(item.getName(), item.getDescription(), item.getPrice(), item.getStockAmount(), item.getUuid());
    }

}
