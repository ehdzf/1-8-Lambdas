package levelone;

import common.stringlists.StringList;

import java.util.List;

public class TaskFour {
    public static void main(String[] args) {
        List<String> months = List.of("January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
                "November", "December");
        StringList stringList = new StringList(months);
        stringList.printOriginalList();
    }
}
