package com.switchfully.Item;

import com.switchfully.Admin.Administrator;
import com.switchfully.SecurityService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;
    private final SecurityService securityService;

    public ItemController(ItemService itemService, SecurityService securityService) {
        this.itemService = itemService;
        this.securityService = securityService;
    }

    @PostMapping(value="/add", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Item addItem(@RequestBody CreateItemDTO createItemDTO) {
        securityService.validateItem(createItemDTO);
        return itemService.addItem(createItemDTO);
    }

    @GetMapping(value="/get", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }
}
