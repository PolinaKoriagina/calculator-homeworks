package guru.qa.service.mock;

import guru.qa.service.Operation;
import guru.qa.service.Reader;

public class MockMinusReader implements Reader {
    @Override
    public int readFirstArg() {
        return 7;
    }

    @Override
    public int readSecondArg() {
        return 3;
    }

    @Override
    public Operation readMathOperator() {
        return Operation.MINUS;
    }
}
