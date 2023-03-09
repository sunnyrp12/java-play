package Classes;

public class StringOperationsClass {

    public static void stringArrayReplace() {
        String[] str = {"abc abc ded ffg"};

        String a = str[0];
        System.out.println("String a ->" + a);

        String b = str[0].replaceAll("\\s", "");
        System.out.println("String a ->" + b);

    }

    public static void operations() {

    }

    public static void equalMethodAndOperator() {
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");

        // (==) compare references/memory locations
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false

        // (equals) compare values/content
        System.out.println("s1 equals s2 ==> " + s1.equals(s2)); // true
        System.out.println("s1 equals s3 ==> " + s1.equals(s3)); // true

    }

    public static void stringCompareAndEliminate() {
        //        String str1 = "Akash";
//        String str2 = "Sunny";

        String str1 = "rajnikant";
        String str2 = "shrikant";

        String str3 = "";

        int i = 0;
        while (str1.length() > i) {

            if (str1.toLowerCase().charAt(i) < str2.toLowerCase().charAt(i)) {
                str3 = str3 + str1.charAt(i);

                str1 = str1.replaceFirst(String.valueOf(str1.charAt(i)), "");
            } else if (str1.toLowerCase().charAt(i) > str2.toLowerCase().charAt(i)) {
                str3 = str3 + str2.charAt(i);

                str2 = str2.replaceFirst(String.valueOf(str2.charAt(i)), "");
            } else if (String.valueOf(str1.charAt(i)).equalsIgnoreCase(String.valueOf(str2.charAt(i)))) {
                str3 = str3 + str1.charAt(i) + str2.charAt(i);

                str1 = str1.replaceFirst(String.valueOf(str1.charAt(i)), "");
                str2 = str2.replaceFirst(String.valueOf(str2.charAt(i)), "");
            }

            if (str2.length() < str1.length()) {
                break;
            }
        }

        str3 = str3 + str2 + str1;
        str1 = "";
        str2 = "";

        System.out.println("Loop ended with result -> ");
        System.out.println("String 1 -> "+ str1);
        System.out.println("String 2 -> "+ str2);
        System.out.println("String 3 -> "+ str3);



    }
}
