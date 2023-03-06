package s5.model;

import s5.Logger;

public class Rational extends SetDigits{
    public Rational(double c) {
        this.x = c;
        Logger.logData("Рациональное число: " + c + " создано.");
    }

    @Override
    public String toString() {
        return "Rational{" +
                "x=" + x +
                '}';
    }
}
