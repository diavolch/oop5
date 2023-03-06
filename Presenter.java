package s5;

import s5.model.Complex;
import s5.model.ComplexCalc;
import s5.model.RationCalc;

import java.util.LinkedList;

public class Presenter<T> extends View {
    T result;
    public T getDigits(LinkedList<Double> arr) {
        ComplexCalc calc = new ComplexCalc();
        RationCalc ratCalc = new RationCalc();
        if (arr.get(0) == 1) {
            calc.setX(arr.get(2));
            calc.setA(arr.get(3));
            calc.setY(arr.get(4));
            calc.setB(arr.get(5));
            if (arr.get(1) == 1) {
                result = (T) calc.sum();
            } else if (arr.get(1) == 2) {
                result = (T) calc.difference();
            } else if (arr.get(1) == 3) {
                result = (T) calc.multiply();
            } else if (arr.get(1) == 4) {
                result = (T) calc.division();
            }
        } else if (arr.get(0) == 2) {
            ratCalc.setX(arr.get(2));
            ratCalc.setY(arr.get(3));
            if (arr.get(1) == 1) {
                result = (T) ratCalc.sum();
            } else if (arr.get(1) == 2) {
                result = (T) ratCalc.difference();
            } else if (arr.get(1) == 3) {
                result = (T) ratCalc.multiply();
            } else if (arr.get(1) == 4) {
                result = (T) ratCalc.division();
            }
        }
        return result;
    }

}
