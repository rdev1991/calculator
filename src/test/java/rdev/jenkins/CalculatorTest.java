package rdev.jenkins;

import org.junit.jupiter.api.*;

/**
 * Created by rameshd on 07/12/2018.
 */
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setupThis() {
        calculator = new Calculator();
    }

    @Tag("Release1.0")
    @Test
    void testAddition() {
        Assertions.assertEquals(7, calculator.add(5, 2));
    }

    @Tag("Release1.0")
    @Test
    void testSubtraction() {
        Assertions.assertEquals(3, calculator.sub(5, 2));
    }

    @AfterEach
    void tearThis() {
        calculator = null;
    }
}
