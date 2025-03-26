package common.stringlists;

import java.util.List;

public class StringListFilterByContainingCharacterAndGreaterThanLength extends StringList {
    private final char character;
    private final int length;

    public StringListFilterByContainingCharacterAndGreaterThanLength(char character, int length) {
        this.character = character;
        this.length = length;
    }

    private List<String> filterContainingCharacterAndGreaterThanLength() {
        String c = String.valueOf(character);
        return super.getStringList().stream()
                .filter(string -> string.contains(c) && string.length() > length)
                .toList();
    }

    @Override
    public List<String> getStringList() {
        return filterContainingCharacterAndGreaterThanLength();
    }
}
