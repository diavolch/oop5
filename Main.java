package s5;

import s5.model.ComplexCalc;
import s5.model.RationCalc;
import s5.model.SetDigits;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Presenter pr = new Presenter();
        View view = new View();
        System.out.println(pr.getDigits(view.getInput()).toString());
    }
}
