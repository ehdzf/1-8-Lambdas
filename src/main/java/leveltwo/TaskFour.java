package leveltwo;

import common.stringlists.StringListProcessor;

import java.util.List;

public class TaskFour {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "Edu",
                "edu",
                "1234",
                "Hola que tal",
                "kapachao",
                "Juan",
                "Que dius!",
                "87.5",
                "1.234f",
                "10L"
        );
        StringListProcessor stringListProcessor = new StringListProcessor(strings);
        List<String> sortedByChar = stringListProcessor.getSortedByFirstCharacter();
        System.out.println("Sorted by first character : ");
        sortedByChar.forEach(System.out::println);
        List<String> sortedByContainingChar = stringListProcessor.getContainingCharFirst('e');
        System.out.println("\n Sorted by containing character : ");
        sortedByContainingChar.forEach(System.out::println);
        List<String> l33tList = stringListProcessor.replaceAWith4();
        System.out.println("\n Replaced 'a' with '4' : ");
        l33tList.forEach(System.out::println);
        List<String> containsNumeric = stringListProcessor.filterNumericValies();
        System.out.println("\n Contains numeric values : ");
        containsNumeric.forEach(System.out::println);
    }
}
