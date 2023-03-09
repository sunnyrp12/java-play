package Classes;

public class PalindromeString {

    public static void palindrome() {


        // Method - 1

        String original = "madam";
        String reverse = "";

        //length is 5
        int stringLength = original.length();

        for (int i = stringLength - 1; i >=0; i--) {
            reverse = reverse + original.charAt(i);
        }

        System.out.println("original string " + original);
        System.out.println("reverse string " + reverse);

        System.out.println("Palindrome = " + original.equals(reverse));



        // Method - 2

////        String name = "moM";
//        String name = "Sunny";
//        String reverseName = "";
//        char ch;
//
//        for (int i=0; i< name.length(); i++) {
//            ch = name.charAt(i);
//            reverseName = ch + reverseName;
//
//        }
//
//        System.out.println("Before Reverse -> " + name);
//        System.out.println("After Reverse -> " + reverseName);
//
//        if (name.equalsIgnoreCase(reverseName)) {
//            System.out.println("String is palindrome");
//        } else {
//            System.out.println("String is not palindrome");
//        }
    }
}
