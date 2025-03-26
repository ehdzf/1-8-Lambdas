package leveltwo;

import common.Calculator;

public class TaskThree {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.sum.operate(2, 3));
        System.out.println(calculator.subtract.operate(2, 3));
        System.out.println(calculator.multiply.operate(2, 3));
        System.out.println(calculator.divide.operate(2, 3));
    }
}
