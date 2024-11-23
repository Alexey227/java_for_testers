import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculateArea() {
        var result = Triangle.getArea();
        Assertions.assertEquals(6,result);
    }

    @Test
    void canCalculatePerimeter() {
        var result = Triangle.getPerimeter();
        Assertions.assertEquals(12,result);
    }
}
