import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(8, calculator.add(5, 3));
        assertEquals(-2, calculator.add(5, -7));
    }

    @Test
    void dif() {
        assertEquals(2, calculator.dif(5, 3));
        assertEquals(12, calculator.dif(5, -7));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(6, 3));
        assertThrows(ArithmeticException.class, () -> calculator.div(5, 0));
    }

    @Test
    void times() {
        assertEquals(15, calculator.times(5, 3));
        assertEquals(0, calculator.times(5, 0));
    }

    @Test
    void solver() {
        // Проверка: a=1, b=5, c=6 -> D = 5^2 - 4*1*6 = 25 - 24 = 1
        assertEquals(1, calculator.solver(1, 5, 6));

        // Проверка: a=2, b=4, c=2 -> D = 4^2 - 4*2*2 = 16 - 16 = 0
        assertEquals(0, calculator.solver(2, 4, 2));

        // Проверка: a=1, b=2, c=3 -> D = 2^2 - 4*1*3 = 4 - 12 = -8
        assertEquals(-8, calculator.solver(1, 2, 3));
    }
}