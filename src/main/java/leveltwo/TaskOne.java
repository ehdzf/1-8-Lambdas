package leveltwo;

import common.stringlists.StringListFilterbyStartsWithCharacterAndExactLength;

import java.util.List;

public class TaskOne {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Ada",
                "Ana",
                "Edu",
                "Laia",
                "Eduardo",
                "Jose"
        );
        char containing = 'A';
        int length = 3;
        StringListFilterbyStartsWithCharacterAndExactLength list = new
                StringListFilterbyStartsWithCharacterAndExactLength(names, containing, length);
        List<String> filtered = list.getStringList();
        filtered.forEach(System.out::println);
    }
}
