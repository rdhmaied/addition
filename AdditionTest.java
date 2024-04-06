import static org.junit.Assert.*;
import org.junit.Test;

public class AdditionTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInteger() {
        Addition.add(5, -3);
    }
}
