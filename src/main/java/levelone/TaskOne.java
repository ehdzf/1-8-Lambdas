package levelone;

import common.stringlists.StringListFilterByContainingCharacter;

public class TaskOne {
    public static void main(String[] args) {
        char character = 'o';
        StringListFilterByContainingCharacter list = new StringListFilterByContainingCharacter(character);
        System.out.println("Full list : \n");
        list.printOriginalList();
        System.out.println("\n----\nListing all the list items that contains the character : '" + character + "'");
        System.out.println("Filtered list : \n");
        list.getStringList().forEach(System.out::println);
    }
}
