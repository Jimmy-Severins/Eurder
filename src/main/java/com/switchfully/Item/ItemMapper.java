package com.switchfully.Item;

import com.switchfully.Item.CreateItemDTO;
import com.switchfully.Item.Item;
import com.switchfully.Order.OrderDTO;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {

    public Item mapToItem(CreateItemDTO createItemDTO) {
        return new Item(createItemDTO.getName(), createItemDTO.getDescription(), createItemDTO.getPrice(), createItemDTO.getStockAmount());
    }

    public CreateItemDTO mapToCreateItemDTO(Item item) {
        return new CreateItemDTO(item.getName(), item.getDescription(), item.getPrice(), item.getStockAmount(), item.getUuid());
    }

    public Item mapToItem(UpdateItemDTO updateItemDTO) {
        return new Item(updateItemDTO.getName(), updateItemDTO.getDescription(), updateItemDTO.getPrice(), updateItemDTO.getStockAmount());
    }

    public Item mapToItem(OrderDTO orderDTO) {
        return new Item(orderDTO.getOrderList().get(0).getItem().getName(), orderDTO.getOrderList().get(0).getItem().getDescription(), orderDTO.getOrderList().get(0).getItem().getPrice(), orderDTO.getOrderList().get(0).getItem().getStockAmount());
    }

}
