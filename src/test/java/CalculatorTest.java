import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Stanislav Rakitov in 2022
 */
class CalculatorTest {

  private final Calculator calculator = new Calculator();

  @Test
  @DisplayName("1 + 1 = 2")
  public void plus() {
    int x = 1;
    int expected = 2;
    int y = calculator.plus.apply(x, x);
    assertEquals(expected, y);
  }

  @Test
  @DisplayName("is positive")
  public void positive() {
    assertTrue(calculator.isPositive.test(1));
  }

  @Disabled("I will do nothing here!")
  @Test
  @DisplayName("Disabled test")
  void disabled() throws Exception {
    throw new Exception("Break it");
  }

  @Test
  @DisplayName("Division by zero")
  void zero() {
    Exception exception =
        assertThrows(ArithmeticException.class, () -> calculator.devide.apply(1, 0));
    assertEquals("/ by zero", exception.getMessage());
  }
}
