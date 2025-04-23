package se.edvard.lektion1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    CalculatorService cs = new CalculatorService();

    @DisplayName("Adding two numbers gives the correct output")
    @Test
    void addTwoNumbers(){
        assertEquals(5.5, cs.add(2.2, 3.3));
    }

    @DisplayName("Subtracting two numbers gives the correct output")
    @Test
    void subtractTwoNumbers(){
        assertEquals(0.9, cs.subtract(7, 6.1));
    }

    @DisplayName("Dividing two numbers gives the correct output")
    @Test
    void divideTwoNumbers(){
        assertEquals(5, cs.divide(25, 5));
    }

    @DisplayName("Dividing with zero returns error")
    @Test
    void divideWithZero(){
        try {
            assertEquals(5, cs.divide(25, 0));
            fail( "Should have thrown an exception" );
        }
        catch (Exception e) {
            String expectedMessage = "Divide by zero";
            assertEquals( expectedMessage, e.getMessage() );
        }
    }

    @DisplayName("Multiplying two numbers gives the correct output")
    @Test
    void multiplyTwoNumbers(){
        assertEquals(10, cs.multiply(5, 2));
    }
}
