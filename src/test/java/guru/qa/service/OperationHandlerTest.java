package guru.qa.service;

import guru.qa.service.OperationHandler;
import guru.qa.service.impl.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationHandlerTest {

        private OperationHandler handler;

    @Test
    void sumTest() {
        handler = new SumOperationHandler();
        int sum = handler.invoke(3, 5);
        Assertions.assertEquals(8, sum);
    }

    @Test
    void multTest() {
        // int mult = calculator.mult(3, 5);
        handler = new MultOperationHandler();
        Assertions.assertEquals(15 , handler.invoke(3, 5));
    }

    @Test
    void minusTest() {
        handler = new MinusOperationHandler();
        int minus = handler.invoke(10, 6);
        Assertions.assertEquals(4, minus);
    }
    @Test
    void divideTest() {
        handler = new DivideOperationHandler();
        int divide = handler.invoke(8, 4);
        Assertions.assertEquals(2, divide);
    }
    @Test
    void powTest() {
        handler = new PowOperationHandler();
        Assertions.assertEquals(9, handler.invoke(3, 2));
    }
}