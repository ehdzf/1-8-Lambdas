package common;

import java.util.List;
import java.util.function.IntFunction;

public class NumberListToCSV {
    private final List<Integer> list;
    private final IntFunction<String> processor = integer -> integer % 2 == 0 ?
            String.format("e%d", integer) : String.format("o%d", integer);

    public NumberListToCSV(List<Integer> list) {
        this.list = list;
    }

    private String createString() {

        final List<String> strings = list.stream().map(processor::apply).toList();
        return String.join(", ", strings);
    }

    public void print() {
        System.out.println(createString());
    }
}
