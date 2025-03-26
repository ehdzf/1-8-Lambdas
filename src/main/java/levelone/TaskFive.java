package levelone;

import common.functionalinterfaces.CalculateCircleArea;
import common.functionalinterfaces.WithPi;

import java.util.Arrays;

public class TaskFive {
    public static void main(String[] args) {
        WithPi pi = () -> 3.14;
        CalculateCircleArea calculateCircleArea = radius -> pi.getPiValue() * radius * radius;
        double[] circles = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println("Value of Pi : " + pi.getPiValue());
        System.out.println("Bonus!!!\n using functional interface in a stream");
        Arrays.stream(circles).map(calculateCircleArea::execute).forEach(area -> System.out.println(area));
    }
}
