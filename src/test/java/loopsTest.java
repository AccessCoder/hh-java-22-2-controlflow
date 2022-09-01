import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class loopsTest {

    @Test
    void testFacFor_0() {
        assertEquals(1, Loops.factorial(0));
    }

    @Test
    void testFacFor_1() {
        assertEquals(1, Loops.factorial(1));
    }

    @Test
    void testFacFor_2() {
        assertEquals(2, Loops.factorial(2));
    }

    @Test
    void testFacFor_3() {
        assertEquals(6, Loops.factorial(3));
    }
}
