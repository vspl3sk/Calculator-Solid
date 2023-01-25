class Rational extends Numbers {
    private double real; // реальная часть

    public Rational(double real) {
        this.real = real;

    }

    public Rational() {
        // this(0);
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

}