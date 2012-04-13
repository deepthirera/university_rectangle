package bootcamp;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: deepthir
 * Date: 6/4/12
 * Time: 11:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class SquareTest {
   @Test
    public void should_calculate_area(){
      assertThat(new Square(4).area(), equalTo(16));
   }

   @Test
    public void should_calculate_large_area(){
      assertThat(new Square(40).area(), equalTo(1600));
   }
}
