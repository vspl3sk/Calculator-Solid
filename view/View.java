package view;

import model.Actions;
import model.Number;
import model.NumberBuilder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    public View() {
    }

    public int hello() {
        int temp = 0;
        boolean flag = false;
        while (!flag) {
            System.out.println("""
                    Выберите одно:
                    1-продолжить вычисления
                    2-показать результат""");
            Scanner in = new Scanner(System.in);
            try {
                temp = in.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Введите число");
            }
            if (temp == 1 || temp == 2) {
                flag = true;
            } else {
                System.out.println("Введите 1 или 2");
            }
        }
        return temp;
    }

    public Number inputNumber() {
        int temp = 0;
        boolean flag = false;
        NumberBuilder numberBuilder = NumberBuilder.getInstance();
        while (!flag) {
            System.out.println("""
                    Выберите тип числа:
                    Рациональное - 1
                    Комплексное - 2""");
            Scanner in = new Scanner(System.in);
            try {
                temp = in.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Введите число");
            }
            if (temp == 1) {
                flag = true;
                inputDouble(numberBuilder);
            } else if (temp == 2) {
                flag = true;
                inputComplex(numberBuilder);

            } else {
                System.out.println("Введите 1 или 2");
            }
        }
        return numberBuilder.build();
    }

    public double correctNumber() {
        boolean flag = false;
        double a = 0;
        while (!flag) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число: ");
            try {
                a = in.nextDouble();
                flag = true;
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Ошибка ввода");
            }
        }
        return a;
    }

    public void inputDouble(NumberBuilder a) {
        a.setnumberReal(correctNumber()).build();
        a.setnumberImage(0.0).build();
    }

    public void inputComplex(NumberBuilder a) {
        System.out.println("Введите действительную часть ");
        a.setnumberReal(correctNumber()).build();
        System.out.println("Введите мнимую часть ");
        a.setnumberImage(correctNumber()).build();

    }

    public  Number chooseAction(Number a, Number b) {
        boolean flag=false;
        int temp = 0;
        Actions actions = new Actions();
        Number c = new Number();
        while (!flag) {
            System.out.println("Выберите действие: 1 - сложение, 2 - умножение, 3 - деление");
            Scanner in = new Scanner(System.in);

            try {
                temp = in.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Введите число");
            }
            if (temp == 1) {
                c = actions.Sum(a, b);
                flag = true;
            } else if (temp == 2) {
                c = actions.Product(a, b);
                flag = true;
            } else if (temp == 3) {
                c = actions.Division(a, b);
                flag = true;
            } else {
                System.out.println("Введите 1 или 2");
            }
        }
        return c;
    }
}