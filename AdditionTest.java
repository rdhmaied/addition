import static org.junit.Assert.*;
import org.junit.Test;

public class AdditionTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInteger() {
        Addition.add(5, -3);
    }
    
    @Test
    public void testPositiveIntegers() {
        assertEquals(8, Addition.add(5, 3));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNonIntegerInputs() {
        Addition.add(5, '3');
    }
}
