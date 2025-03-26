package levelone;

import common.stringlists.StringListFilterByContainingCharacterAndGreaterThanLength;

public class TaskTwo {
    public static void main(String[] args) {
        char character = 'o';
        int length = 5;
        StringListFilterByContainingCharacterAndGreaterThanLength list = new StringListFilterByContainingCharacterAndGreaterThanLength(character, length);
        System.out.println("Full list : \n");
        list.printOriginalListDetails();
        System.out.println("\n----\nFiltered list : \n");
        list.getStringList().forEach(System.out::println);
    }
}
