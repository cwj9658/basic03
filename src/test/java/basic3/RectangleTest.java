package basic3;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void rectangleTest() {
        Rectangle rectangle = new Rectangle(3,4);
        Integer result = rectangle.calculate();
        Assert.assertEquals(Integer.valueOf(12), result);
    }
}
