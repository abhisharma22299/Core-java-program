public class test {
    static void printNNumberWithoutUsingLoops(int n){
     //   int first=1;


        if (n>0){



            printNNumberWithoutUsingLoops(n-1);

            System.out.println(n);
        }

    }
    public static void main(String[] args) {
printNNumberWithoutUsingLoops(1);

  // String a="ABHISHEK";
  // String b="ABHISHEK";
//        String name= new String("bimlesh");
//        String name2= new String("bimlesh");
//        if (name2.intern()==name.intern()){
//            System.out.println("true");
//        }
    }
}
