public class stringBulder {
static void reverseAString(){
    StringBuilder name= new StringBuilder("hello");


    for (int i =0;i<name.length()/2;i++){
        int front =i;
        int back= name.length()-1-i;

      char frontChar=name.charAt(front);
        char backChar=name.charAt(back);
        name.setCharAt(front,backChar);
name.setCharAt(back,frontChar);
    }
    System.out.println(name);

}

    public static void main(String[] args) {

StringBuilder name = new StringBuilder("bhishek" );
StringBuilder name2 = new StringBuilder("sharma");

     //   name.insert(0,'a');
//        System.out.println(name);
//        name.delete(4,name.length());
//        System.out.println(name);

        //System.out.println(name.append("a"));

     //   System.out.println( reverseAString(name2));

   reverseAString();
    }

}
