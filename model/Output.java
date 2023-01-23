package model;

public class Output {

    public String shortOutput(Number a) {
        if (a.getNumberImage() == 0) {
            return String.format("%.3f", a.getNumberReal());
        } else if (a.getNumberImage() < 0) {
            return String.format("%.3f", a.getNumberReal()) + " " + String.format("%.3f", a.getNumberImage()) + "i";
        } else {
            return String.format("%.3f", a.getNumberReal()) + "+" + String.format("%.3f", a.getNumberImage()) + "i";
        }
    }
}