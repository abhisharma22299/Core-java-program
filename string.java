import java.util.Arrays;

public class string {
    static void toConvertACharaterToInteger(char a) {
        int c = a;
        System.out.println(c);
    }

    static void toConvertAIntegerToCharater(int a) {
        char c = 'a';

        System.out.println(c);
    }

    static void removeConstituiveCharracter(String a) {
        char b[] = a.toCharArray();
        for (int i = 1; i < b.length; i++) {
            if (b[i] == b[i - 1]) {
                for (int j = i; j < b.length; j++)
                    b[i] = b[i + 1];
            }

        }
    }

    static void anagramValidation(String first, String second) {
        first = first.toLowerCase();
        second = second.toLowerCase();

        char a[] = first.toCharArray();
        char b[] = second.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean result = Arrays.equals(a, b);
        if (result == true) {
            System.out.println("THese STRING ARE ANAGRAM STRING");

        } else {
            System.out.println("THESE STRING ARE NOT A ANAGRAM STRING");
        }
    }

    static void validParathesis(String para) {
        char a[] = para.toCharArray();
        for (int i = 0; i < a.length; i++) {

        }

    }

    static void findLenghtOfAString(String para) {
        System.out.println(para.length());

    }

    static void findSubStringOfAString(String para) {
        System.out.println(para.substring(1, 3));

    }

    static void compareOfTwoStringString(String para, String para2) {
        System.out.println(para.intern() == para2.intern());

    }

    static void testOfIgnoreUpperCase(String n, String m) {
        System.out.println(n.equalsIgnoreCase(m));
    }

    static void testOfSplitFunctionInString(String a) {

        String b = "";
        String arr[] = a.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            b = b + arr[i] + " ";
        }
        System.out.println(b);
    }

    static String panagramValidation(String a) {
        // it us to get all the A-Z ement present in the array

        int b = a.length();
        int arr[] = new int[26];

String ass=a;
         ass= a.replace(" ", "");
        a = a.toUpperCase();


        for (int i = 0; i < ass.length() - 1; i++) {
            arr[a.charAt(i) - 65]++;
        }


    for(
    int j=0;j<arr.length-1;j++)

    {
        if (arr[j] == 0) {
            return "Not A PANAGRAM";
        }
    }

    return"PALANGRAM";

}

    static String findMostCommonStringInAConcutiveArray(String arr[][]){

        for (String a[]:arr){
            for (String b: a){


                }
            }

        return "";
    }
        public static void main(String[] args) {
// STRING ARE IMMUTABLE

        //anagramValidation("abhishe","shekabhi");

  //removeConstituiveCharracter("aabbhhiisshheekk");
   // toConvertACharaterToInteger('A');

  String name =new String();
//    String name2 =new String("ABHISHK");
//    compareOfTwoStringString(name,name2);
//            System.out.println(name.charAt(0));
  //  testOfIgnoreUpperCase("abhi", "ABHI");
   // testOfSplitFunctionInString("abhishek sharma is leaning Java From Pw Skills");

           // anagramValidation("abhishek","keshabhi");

       //     System.out.println(panagramValidation("aaabbbcbdbebfbgbhbibdjdkdlsmsdnfosdpc" ));

//    String arr[][]={{"abhishek"},{"sharma"},{"bca"}};
//    findMostCommonStringInAConcutiveArray(arr);
            System.out.println(name);
    }

}
