package model;

public class NumberBuilder {
    private static NumberBuilder instance;
    Number obj;

    private NumberBuilder() {
    }

    public static NumberBuilder getInstance() {
        if (instance == null)
            instance = new NumberBuilder();
        instance.obj = new Number();

        return instance;
    }

    public NumberBuilder setnumberReal(Double a) {
        obj.numberReal = a;
        return this;
    }

    public NumberBuilder setnumberImage(Double a) {
        obj.numberImage = a;
        return this;
    }

    public Number build() {
        return obj;

    }
}