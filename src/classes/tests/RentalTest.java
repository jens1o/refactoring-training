package classes.tests;

import classes.Movie;
import classes.Rental;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentalTest
{

    private Movie movie;
    private Rental rental;
    private final int daysRented = 24;

    @BeforeEach
    public void setUp()
    {
        movie = new Movie("Fowler", 1);
        rental = new Rental(movie, daysRented);
    }

    @Test
    void getDaysRented()
    {
        assertEquals(daysRented, rental.getDaysRented());
    }

    @Test
    void getMovie()
    {
        assertEquals(movie, rental.getMovie());
    }


}