package common.stringlists;

import java.util.Comparator;
import java.util.List;

public class StringListSorterByLength extends StringList {

    public StringListSorterByLength(List<String> list) {
        super(list);
    }

    public List<String> sortByLength() {
        return getStringList().stream()
                .sorted(Comparator.comparing(String::length)).toList();
    }

    public List<String> sortReverseByLength() {
        return getStringList().stream()
                .sorted(Comparator.comparing(String::length).reversed()).toList();
    }
}
