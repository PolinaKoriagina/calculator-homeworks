package guru.qa.service;

import guru.qa.service.mock.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator = new Calculator(new MockMultReader(), new MockWriter());

    @Test
    void calculatorTestMultiply() {
        calculator = new Calculator(new MockMultReader(), new MockWriter()); // 3,5, *
        String result = calculator.start();
        Assertions.assertEquals("3 * 5 = 15", result);
    }

    @Test
    void calculatorTestSum() {
        calculator = new Calculator(new MockSumReader(), new MockWriter()); // 4,2, +
        String result = calculator.start();
        Assertions.assertEquals("4 + 2 = 6", result);
    }

    @Test
    void calculatorTestMinus() {
        calculator = new Calculator(new MockMinusReader(), new MockWriter()); // 7,3, -
        String result = calculator.start();
        Assertions.assertEquals("7 - 3 = 4", result);
    }

    @Test
    void calculatorTestDivide() {
        calculator = new Calculator(new MockDivideReader(), new MockWriter()); // 9,3, /
        String result = calculator.start();
        Assertions.assertEquals("9 / 3 = 3", result);
    }

    @Test
    void calculatorTestPow() {
        calculator = new Calculator(new MockPowReader(), new MockWriter()); // 5,2, 25
        String result = calculator.start();
        Assertions.assertEquals("5 ^ 2 = 25", result);
    }

}