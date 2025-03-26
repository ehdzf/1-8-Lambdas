package common.stringlists;

import java.util.List;

public class StringList {
    private final List<String> stringList;

    public StringList() {
        stringList = List.of("John", "Jane", "Chuck", "Norris");
    }

    public StringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void printOriginalList() {
        stringList.forEach(System.out::println);
    }

    public void printOriginalListWithLamda() {
        stringList.forEach(string -> System.out.println(string));
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void printOriginalListDetails() {
        stringList.forEach(string -> System.out.println(string + " contains " + string.length() + " characters"));
    }
}
