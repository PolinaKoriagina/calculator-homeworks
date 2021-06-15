package guru.qa.service.impl;

import guru.qa.service.Writer;

public class ConsoleWriter implements Writer {

    @Override
    public Object handleString(String outputString){
        System.out.println(outputString);
        return null;
    }
}
