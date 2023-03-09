package Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestClassOne {







    public void collectionOperations() {

        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(7);
        integers.add(9);
        integers.add(8);
        Collections.sort(integers);


    }




    public static void objectEqualTest() {
        TestClassTwo testClassTwo1 = new TestClassTwo();
        TestClassTwo testClassTwo2 = new TestClassTwo();

        testClassTwo1.id = 1;
        testClassTwo1.name = "Sunny";

//        testClassTwo2 = testClassTwo1;
        testClassTwo2.id = 1;
        testClassTwo2.name = "Sunny";

        System.out.println(testClassTwo1.hashCode());
        System.out.println(testClassTwo2.hashCode());
        if (testClassTwo1.equals(testClassTwo2)) {
            System.out.println("Both objects are equal");
            System.out.println(testClassTwo1.name);
            System.out.println(testClassTwo2.name);
        }
    }

}
