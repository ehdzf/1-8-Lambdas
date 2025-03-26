package leveltwo;

import common.NumberListToCSV;

import java.util.List;

public class TaskTwo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        NumberListToCSV listToCSV = new NumberListToCSV(numbers);
        listToCSV.print();
    }
}
