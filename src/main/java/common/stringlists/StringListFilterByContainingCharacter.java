package common.stringlists;

import java.util.List;

public class StringListFilterByContainingCharacter extends StringList {
    char character;

    public StringListFilterByContainingCharacter(char character) {
        this.character = character;
    }

    public List<String> filterContainingCharacter() {
        String c = String.valueOf(character);
        return super.getStringList().stream()
                .filter(name -> name.contains(c))
                .toList();
    }

    @Override
    public List<String> getStringList() {
        return filterContainingCharacter();
    }
}
