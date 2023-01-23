package model;

public class Actions {

    public Number Sum(Number a, Number b) {
        NumberBuilder numberBuilder = NumberBuilder.getInstance();
        numberBuilder.setnumberReal(a.getNumberReal() + b.getNumberReal());
        numberBuilder.setnumberImage(a.getNumberImage() + b.getNumberImage());
        return numberBuilder.build();
    }

    public Number Product(Number a, Number b) {
        NumberBuilder numberBuilder = NumberBuilder.getInstance();
        numberBuilder.setnumberReal(a.getNumberReal() * b.getNumberReal());
        numberBuilder.setnumberImage(a.getNumberImage() * b.getNumberReal() + a.getNumberReal() * b.getNumberImage()
                - a.getNumberImage() * b.getNumberImage());
        return numberBuilder.build();
    }

    public Number Division(Number a, Number b) {
        NumberBuilder numberBuilder = NumberBuilder.getInstance();
        numberBuilder.setnumberReal((a.getNumberReal() * b.getNumberReal() + a.getNumberImage() * b.getNumberImage())
                / (b.getNumberReal() * b.getNumberReal() + b.getNumberImage() * b.getNumberImage()));
        numberBuilder.setnumberImage((a.getNumberImage() * b.getNumberReal() - a.getNumberReal() * b.getNumberImage())
                / (b.getNumberReal() * b.getNumberReal() + b.getNumberImage() * b.getNumberImage()));
        return numberBuilder.build();
    }
}