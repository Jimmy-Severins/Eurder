import com.switchfully.Item.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ItemTest {
    @Test
    void whenAddingAnItem_thenItemIdCountsUp() {

        ItemService itemService = new ItemService(new ItemRepository(), new ItemMapper());
        Item item1 = new Item("Harry Potter", "J.K. Rowling", 10, 10);
        Item item2 = new Item("Harry Potter 2", "J.K. Rowling", 15, 10);

        itemService.addItem(itemService.itemMapper.mapToCreateItemDTO(item1));
        itemService.addItem(itemService.itemMapper.mapToCreateItemDTO(item2));
        List<Item> itemlist = itemService.itemRepository.itemList;

        Assertions.assertThat(itemlist.get(0).getId()).isEqualTo(1);
        Assertions.assertThat(itemlist.get(1).getId()).isEqualTo(2);


    }
}
