import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);


    Complex getValue() {
        Complex c = new Complex();
        System.out.print("Введите целую часть ");
        c.setReal(in.nextDouble());
        System.out.print("Введите мнимую часть ");
        c.setImage(in.nextDouble());
        return c;
    }
    Rational getValue1() {
        Rational c = new Rational();
        System.out.print("Введите рациональное число ");

        c.setReal(in.nextDouble());
        return c;
    }

    String printComplex(String title, Complex result) {

        StringBuilder sb = new StringBuilder();

        if (result.getImage() >= 0)
            sb.append(String.format("\n%s%.2f+%.2fi\n", title, result.getReal(), result.getImage()));

        else
            sb.append(String.format("\n%s%.2f %.2fi\n", title, result.getReal(), result.getImage()));
        return sb.toString();

    }
    String printRational(String title, Rational result) {

        StringBuilder sb = new StringBuilder();

            sb.append(String.format("\n%s%.2f\n", title, result.getReal()));

        return sb.toString();

    }
}