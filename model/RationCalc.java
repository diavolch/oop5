package s5.model;

import s5.Logger;

public class RationCalc extends SetDigits implements Model<Rational>{
    @Override
    public Rational sum() {
        Logger.logData("Сумма рациональных чисел: ");
        return new Rational(x + y);
    }

    @Override
    public Rational difference() {
        Logger.logData("Разность рациональных чисел: ");
        return new Rational(x - y);
    }

    @Override
    public Rational multiply() {
        Logger.logData("Прроизведение рациональных чисел: ");
        return new Rational(x * y);
    }

    @Override
    public Rational division() {
        Logger.logData("Частное рациональных чисел: ");
        return new Rational(x / y);
    }
}
