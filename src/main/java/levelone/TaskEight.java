package levelone;

import common.functionalinterfaces.StringReverser;

public class TaskEight {
    public static void main(String[] args) {
        StringReverser stringReverser = input -> {
            StringBuilder stringBuilder = new StringBuilder(input);
            return stringBuilder.reverse().toString();
        };
        System.out.println(stringReverser.apply("Reverse this!"));
        System.out.println(stringReverser.apply("54321"));
    }
}
