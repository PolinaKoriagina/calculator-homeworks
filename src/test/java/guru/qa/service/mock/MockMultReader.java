package guru.qa.service.mock;

import guru.qa.service.Reader;
import guru.qa.service.Operation;

public class MockMultReader implements Reader {
    @Override
    public int readFirstArg() {
        return 3;
    }

    @Override
    public int readSecondArg() {
        return 5;
    }

    @Override
    public Operation readMathOperator() {
        return Operation.MULT;
    }
}
