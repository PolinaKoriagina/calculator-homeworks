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
        writer.handleString("Введите два числа: ");
        int first = reader.readFirstArg();
        int second = reader.readSecondArg();
        writer.handleString("Введите оператор (+, *, -, ^, /): ");
        Operation po = reader.readMathOperator();
        int sum = po.getOperation().invoke(first, second);

        writer.handleString("\nРезультат:\n");
        return first + " " + po.getSymbol() + " " + second + " = " + sum;
    }

    }

