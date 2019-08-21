package basic3;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void rectangleTest() {
        Rectangle rectangle = new Rectangle(3,4);
        Integer result = rectangle.calculate();
        Assert.assertTrue("长3宽4的矩形面积应该为12", result == 12);
    }
}
