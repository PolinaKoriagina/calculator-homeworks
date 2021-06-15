package guru.qa.service.mock;

import guru.qa.service.Operation;
import guru.qa.service.Reader;

public class MockSumReader implements Reader {
    @Override
    public int readFirstArg() {
        return 4;
    }

    @Override
    public int readSecondArg() {
        return 2;
    }

    @Override
    public Operation readMathOperator() {
        return Operation.SUM;
    }
}
