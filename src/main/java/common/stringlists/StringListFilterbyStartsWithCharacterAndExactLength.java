package common.stringlists;

import java.util.List;

public class StringListFilterbyStartsWithCharacterAndExactLength extends StringList {
    private final char character;
    private final int length;

    public StringListFilterbyStartsWithCharacterAndExactLength(List<String> list, char character, int length) {
        super(list);
        this.character = character;
        this.length = length;
    }

    private List<String> filter() {
        String c = String.valueOf(character);
        return super.getStringList().stream()
                .filter(string -> string.startsWith(c) && string.length() == length)
                .toList();
    }

    @Override
    public List<String> getStringList() {
        return filter();
    }
}
