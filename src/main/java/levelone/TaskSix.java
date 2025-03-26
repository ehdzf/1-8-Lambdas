package levelone;

import common.stringlists.StringListSorterByLength;

import java.util.List;

public class TaskSix {
    public static void main(String[] args) {
        List<String> list = List.of(
                "Edu",
                "Hola que tal",
                "kapachao",
                "Juan",
                "Que dius!"
        );
        StringListSorterByLength sorter = new StringListSorterByLength(list);
        System.out.println("Sorted by length : \n");
        List<String> sorted = sorter.sortByLength();
        sorted.forEach(System.out::println);
    }
}
