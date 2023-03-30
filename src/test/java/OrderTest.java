import com.switchfully.CreateOrderDTO;
import com.switchfully.Item.Item;
import com.switchfully.Item.ItemGroup;
import com.switchfully.Order;
import org.junit.jupiter.api.Test;

public class OrderTest {
    @Test
    void name() {
        Item item1 = new Item("Harry Potter", "J.K. Rowling", 10, 20);
        Item item2 = new Item("Harry Potter 2", "J.K. Rowling", 10, 20);
        Item item3 = new Item("Harry Potter 3", "J.K. Rowling", 10, 20);

        ItemGroup itemGroup1 = new ItemGroup(item1, 2);
        ItemGroup itemGroup2 = new ItemGroup(item2, 2);
        ItemGroup itemGroup3 = new ItemGroup(item3, 2);

        Order order = new Order();
        order.addItemGroup(itemGroup1);
        order.addItemGroup(itemGroup2);
        order.addItemGroup(itemGroup3);

        CreateOrderDTO createOrderDTO = new CreateOrderDTO(order);
        System.out.println(createOrderDTO.getOrderList());
    }
}

