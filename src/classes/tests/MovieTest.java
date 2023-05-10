package classes.tests;

import classes.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest
{
    Movie movie;
    String title;
    int price;

    @BeforeEach
    public void setUp()
    {
        title = "Ralph reichts";
        price = 1;
        movie = new Movie(title, price);
    }

    @Test
    void getPriceCode()
    {
        assertEquals(price, movie.getPriceCode());
    }

    @Test
    void setPriceCode()
    {
        movie.setPriceCode(3);
        assertEquals(3, movie.getPriceCode());
    }

    @Test
    void getTitle()
    {
        assertEquals(title, movie.getTitle());
    }

}