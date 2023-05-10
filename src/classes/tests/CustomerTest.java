package classes.tests;

import classes.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomerTest {
    private Customer customer;
    private String name;

    @BeforeEach
    public void setUp() {
        name = "Jens";
        customer = new Customer(name);
    }

    @Test
    void getName() {
        assertEquals(name, customer.getName());
    }

    @Test
    void statement() {
        assertTrue(customer.statement().startsWith("Rental Record for " + name));
    }
}