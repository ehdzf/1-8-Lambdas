package common.stringlists;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;

public class StringListProcessor {
    private final StringList list;

    public StringListProcessor(List<String> list) {
        this.list = new StringList(list);
    }

    public List<String> getSortedByFirstCharacter() {
        return list.getStringList().stream()
                .sorted((String a, String b) -> Character.compare(a.charAt(0), b.charAt(0)))
                .toList();
    }

    public List<String> getContainingCharFirst(char character) {
        return list.getStringList().stream().sorted((a, b) -> {
            if (a.contains(String.valueOf(character)) && !b.contains(String.valueOf(character))) {
                return -1;
            } else if (!a.contains(String.valueOf(character)) && b.contains(String.valueOf(character))) {
                return 1;
            } else {
                return 0;
            }
        }).toList();
    }

    public List<String> replaceAWith4() {
        return list.getStringList().stream().map(string -> string.replace("a", "4")).toList();
    }

    public List<String> filterNumericValies() {
        return list.getStringList().stream().filter(NumberUtils::isCreatable).toList();
    }
}
