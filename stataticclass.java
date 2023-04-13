
final class sham{

}
public class stataticclass
{

    static int a ; // * instance variable


    {
        a=10;
        System.out.println(a);
        System.out.println("initilization block");

    }

    static {
        System.out.println("static inintilization block");
    }



    public static void main(String[] args) {
    int a=0; // loca variable

        System.out.println("we ARE IN Main");
        stataticclass obj =new stataticclass();


    }
}
