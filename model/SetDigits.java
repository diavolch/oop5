package s5.model;

import lombok.Getter;
import s5.Logger;

@Getter
public class SetDigits {
    protected double x;
    protected double y;
    protected double a;
    protected double b;

    public void setX(double x) {
        this.x = x;
        Logger.logData("Число x: " + x);
    }

    public void setY(double y) {
        this.y = y;
        Logger.logData("Число y: " + y);
    }

    public void setA(double a) {
        this.a = a;
        Logger.logData("Мнимая часть x: " + a);
    }

    public void setB(double b) {
        this.b = b;
        Logger.logData("Мнимая чать y: " + b);
    }
}
