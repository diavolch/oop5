package s5.model;

import s5.Logger;

public class ComplexCalc extends SetDigits implements Model<Complex>{

    @Override
    public Complex sum() {
        Logger.logData("Сумма комплексных чисел: ");
        return new Complex((x + y), (a + b));
    }

    @Override
    public Complex difference() {
        Logger.logData("Разность комплексных чисел: ");
        Logger.logData("x - " + x + " y - " + y + " a - " + a + "b - " + b);
        return new Complex(x - y, a - b);
    }

    @Override
    public Complex multiply() {
        Logger.logData("Произведение комплексных чисел: ");
        return new Complex((x*y - a*b), (y*a + b*x));
    }

    @Override
    public Complex division() {
        Logger.logData("Частное комплексных чисел: ");
        return new Complex((x*y + a*b)/(y*y + b*b), (y*a - b*x)/(y*y+b*b));
    }
}
