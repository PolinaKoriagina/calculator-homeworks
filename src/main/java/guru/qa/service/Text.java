package guru.qa.service;

public enum Text {

    ENTER_ARGS("Введите два числа: "),
    ENTER_OPERATOR("Введите оператор (+, *, -, ^, /): "),
    RESULT_OUTPUT("\nРезультат:\n");

    private final String text;

    Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
