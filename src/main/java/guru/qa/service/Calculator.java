package guru.qa.service;

import java.util.List;

public class Calculator {

    private final Reader reader;
    private final Writer writer;

    private List<String> strings;

    public Calculator(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String start() {
        writer.handleString(Text.ENTER_ARGS.getText());
        int first = reader.readFirstArg();
        int second = reader.readSecondArg();
        writer.handleString(Text.ENTER_OPERATOR.getText());
        Operation po = reader.readMathOperator();
        int sum = po.getOperation().invoke(first, second);

        writer.handleString(Text.RESULT_OUTPUT.getText());
        return first + " " + po.getSymbol() + " " + second + " = " + sum;
    }

    }

