package levelone;

import common.stringlists.StringListSorterByLength;

import java.util.List;

public class TaskSeven {
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
        List<String> reversed = sorter.sortReverseByLength();
        reversed.forEach(System.out::println);
    }
}
