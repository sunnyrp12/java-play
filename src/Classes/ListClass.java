package Classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListClass {

    public static void duplicateValues() {

        List<String> stringList = new ArrayList<>();
        stringList.add("Sunny");
        stringList.add("Abhishek");
        stringList.add("Shubham");
        stringList.add("Gourav");
        stringList.add("Gourav");
        stringList.add("Sunny");
        stringList.add("Sunny");

        Set<String> stringSet = new HashSet<>();
        Set<String> duplicateValueSet = new HashSet<>();

        for (String s: stringList) {
            if (!stringSet.add(s)) {
                duplicateValueSet.add(s);
            }
        }

        System.out.println("Distinct Values" + stringSet);
        System.out.println("Duplicate Values" + duplicateValueSet);
    }


}
