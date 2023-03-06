package s5.model;

import s5.Logger;

public class Complex extends SetDigits {
    public Complex(double c, double d) {
        this.x = c;
        this.y = d;
        Logger.logData("Комплексное число: " + c + ", " + d + "i создано.");
    }

    @Override
    public String toString() {
        return "Complex{" +
                "Действительная часть=" + x +
                ", Мнимая часть=" + y +
                "i}";
    }
}
