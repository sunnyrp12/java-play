package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingClass {

    public static void listSorting() {

        List<String> stringList = new ArrayList<>();
        stringList.add("Sunny");
        stringList.add("Shubham");
        stringList.add("Ayush");
        Collections.sort(stringList);
        System.out.println(stringList);

        List<Integer> integers = new ArrayList<>();
        integers.add(8);
        integers.add(5);
        integers.add(9);
        integers.add(2);
        List<Integer> integerList = new ArrayList<>(integers);
        System.out.println("Before Sorting" + integers);

        Collections.sort(integers);
        System.out.println("After collections sort" + integers);
        Collections.sort(integers, Collections.reverseOrder());
        System.out.println("After collection reverse  sort" + integers);



        System.out.println("Before hard code Sorting" + integerList);
        for (int i = 0; i < integerList.size(); i ++) {
            for (int j = i+1; j < integerList.size(); j ++) {
                int temp = 0;
                if (integerList.get(j) < integerList.get(i)) {
                    temp = integerList.get(i);
                    integerList.set(i, integerList.get(j));
                    integerList.set(j, temp);
                }
            }
        }
        System.out.println("After hard code Sorting" + integerList);



    }

    public static void arraySorting() {

        int[] arr = {8,5,9,2};
        System.out.println("Array before sort" + arr);
        for (int i = 0; i < arr.length; i ++) {
            for (int j = i+1; j < arr.length; j ++) {
                int temp = 0;
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        for (int i: arr) {
            System.out.print(i);
            System.out.print("\t");
        }



    }
}
