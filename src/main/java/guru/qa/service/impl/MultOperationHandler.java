package guru.qa.service.impl;

import guru.qa.service.OperationHandler;

public class MultOperationHandler implements OperationHandler {

    @Override
    public int invoke(int first, int second) {
        return first * second;
    }
}
