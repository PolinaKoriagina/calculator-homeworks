package guru.qa.service.mock;

import guru.qa.service.Operation;
import guru.qa.service.Reader;

public class MockDivideReader implements Reader {
    @Override
    public int readFirstArg() {
        return 9;
    }

    @Override
    public int readSecondArg() {
        return 3;
    }

    @Override
    public Operation readMathOperator() {
        return Operation.DIVIDE;
    }
}
