package s5;

import s5.model.SetDigits;

import java.util.LinkedList;
import java.util.Scanner;

public class View {
//    protected double x;
//    protected double a;
//    protected double y;
//    protected double b;
//    protected int sign;

    public LinkedList getInput() {
        LinkedList<Double> arr = new LinkedList<>();
        System.out.println("Операцию с каким числом необходимо сделать: \n" +
                "1. Комплексное;\n" +
                "2. Рациональное");
        Scanner scan = new Scanner(System.in);
        double chooseDigit = scan.nextDouble();
        arr.add(chooseDigit);
        System.out.println("Какое действие с числами необходимо сделать: \n" +
                "1. Сложение;\n" +
                "2. Вычитание;\n" +
                "3. Умножение;\n" +
                "4. Деление;");
        double sign = scan.nextDouble();
        arr.add(sign);
        if (chooseDigit == 1) {
            System.out.println("Введите действительную часть первого числа: ");
            double x = scan.nextDouble();
            System.out.println("Введите мнимую часть первого числа: ");
            double a = scan.nextDouble();
            System.out.println("Введите действительную часть второго числа: ");
            double y = scan.nextDouble();
            System.out.println("Введите мнимую часть второго числа: ");
            double b = scan.nextDouble();
            arr.add(x);
            arr.add(a);
            arr.add(y);
            arr.add(b);
        }
        else if (chooseDigit == 2) {
            System.out.println("Введите первое рациональное число: ");
            double x = scan.nextDouble();
            System.out.println("Введите второе рациональное число: ");
            double y = scan.nextDouble();
            arr.add(x);
            arr.add(y);
        }
        else {
            System.out.println("Такого варианта нет!");
        }
        return arr;
    }
}
