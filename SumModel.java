class SumModel extends CalcModel {

    @Override
    public Complex result() {
        double newReal = super.b.getReal() + super.a.getReal();
        double newImage = super.b.getImage() + super.a.getImage();
        Complex result = new Complex(newReal, newImage);
        return result;
    }

    @Override
    public Rational result1() {
        double newReal = super.c.getReal() + super.d.getReal();
        return new Rational(newReal);
    }

    @Override
    public void setA(Complex c) {
        a.setReal(c.getReal());
        a.setImage(c.getImage());
    }

    @Override
    public void setRatioA(Rational r) {
        c.setReal(r.getReal());
    }

    @Override
    public void setRatioB(Rational r) {
        d.setReal(r.getReal());
    }

    @Override
    public void setB(Complex c) {
        b.setReal(c.getReal());
        b.setImage(c.getImage());
    }
}