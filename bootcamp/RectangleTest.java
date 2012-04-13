package bootcamp;

import org.junit.Test;

import java.util.Random;

import static bootcamp.Rectangle.*;
import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class RectangleTest {

    @Test
    public void should_have_a_perimeter() {
        assertEquals(20, createRectangle(5, 5).perimeter());
    }

    @Test
    public void should_have_an_area() {
        assertEquals(1, createRectangle(1, 1).area());
    }

    @Test
    public void should_calculate_area_for_square(){
        assertThat(createSquare(4).area(), equalTo(16));
    }

    @Test
    public void should_multiply_by_random_1(){
        Rectangle rectangle = new Rectangle(new Fakerandom());
        assertThat(rectangle.multiply(3), equalTo(18));
    }

    @Test
    public void should_multiply_by_random_2(){
        Rectangle rectangle = new Rectangle(giverandom());
        assertThat(rectangle.multiply(3), equalTo(18));
    }

    private Random giverandom() {
        return new FakeRandom();
    }


    private class FakeRandom extends java.util.Random {
        @Override
        public int nextInt() {
            return 6;
        }
        }
}
