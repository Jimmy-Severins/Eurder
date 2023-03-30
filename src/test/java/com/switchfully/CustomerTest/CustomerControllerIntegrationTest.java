package com.switchfully.CustomerTest;

import com.switchfully.Customer.Customer;
import com.switchfully.Customer.CustomerRepository;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.test.annotation.DirtiesContext;

import java.util.UUID;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class CustomerControllerIntegrationTest {
    @LocalServerPort
    private int port;
   @Autowired
    private CustomerRepository repository;

    @Test
    void whenIPostACustomer_thenTheRepositoryContainsThisCustomer() {
        Customer customer = new Customer("John", "Doe", "a0", null, "c");

        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(customer)
                .when()
                .port(port)
                .post("/customers/create")
                .then()
                .assertThat()
                .statusCode(HttpStatus.CREATED.value());

        Assertions.assertThat(repository.getCustomerById(customer.getId()).get().getId()).isEqualTo(customer.getId());

    }

    @Test
    void whenThereIsOneCustomerInTheRepository_thenICanRetrieveThisCustomerById() {
        Customer customer = new Customer("John", "Doe", "a0", null, "c");
        repository.addCustomer(customer);

        Customer customer1 = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .port(port)
                .get("/customers/" + customer.getId())
                .then()
                .assertThat()
                .statusCode(HttpStatus.OK.value())
                .extract()
                .as(Customer.class);

        Assertions.assertThat(customer1.getId()).isEqualTo(customer.getId());

    }

    @Test
    void whenTheRepositoryIsEmpty_thenIReceiveA404WhenRequestingACustomerById(){

        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .port(port)
                .get("/customers/" + UUID.randomUUID())
                .then()
                .assertThat()
                .statusCode(HttpStatus.NOT_FOUND.value());
    }
}
