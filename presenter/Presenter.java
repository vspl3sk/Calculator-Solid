package presenter;

import model.Number;
import model.Output;
import view.View;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Presenter {
    public Presenter() {
    }

    public static final Logger logger = Logger.getLogger(Presenter.class.getName());

    public void start() throws IOException {
        FileHandler fh = new FileHandler("log1.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        int temp;
        Number number1, number2;
        View view = new View();
        boolean flag = false;
        Output output = new Output();

        number1 = view.inputNumber();
        logger.log(Level.INFO, "Первое число " + output.shortOutput(number1));
        while (!flag) {
            temp = view.hello();
            if (temp == 1) {
                number2 = view.inputNumber();
                logger.log(Level.INFO, "Второе число " + output.shortOutput(number2));
                number1 = view.chooseAction(number1, number2);
                logger.log(Level.INFO, "Промежуточный результат " + output.shortOutput(number1));
            } else {
                System.out.println("Окончательный результат " + output.shortOutput(number1));
                flag = true;
            }
        }
    }
}