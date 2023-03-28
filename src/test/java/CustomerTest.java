import com.switchfully.Address;
import com.switchfully.Customer.Customer;
import com.switchfully.Customer.CustomerMapper;
import com.switchfully.Customer.CustomerRepository;
import com.switchfully.Customer.CustomerService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    @Test
    void whenAddingACustomer_thenCustomerIsAddedToCustomerList() {
        CustomerService customerService = new CustomerService(new CustomerRepository(), new CustomerMapper());
        Customer customer1 = new Customer("John", "Doe", "a", new Address("a", "a", "a", "a","a"), "a");

        customerService.createCustomer(customerService.customerMapper.mapToCreateCustomerDTO(customer1));

        Assertions.assertThat(customerService.customerRepository.customerList.get(0).getFirstName()).isEqualTo("John");
    }
}
