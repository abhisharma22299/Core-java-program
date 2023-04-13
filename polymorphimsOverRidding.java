
class Abhishek{


    public void pname(){
        System.out.println("BASE CLASS");
    }

}
class Abhishek2 extends Abhishek {


    public void pname(){
        System.out.println("child2 CLASS");
    }

}
class Abhishek3 extends Abhishek {


    public void pname(){
        System.out.println("child3 CLASS");
    }

}
class Abhishek4 {
    public void poly(Abhishek ref) {

        System.out.println("----------------------------------");
        ref.pname();
    }
}
public class polymorphimsOverRidding {
    public static void main(String[] args) {
        
    Abhishek obj3 =new Abhishek();
    Abhishek2 obj=new Abhishek2();
    Abhishek3 obj1=new Abhishek3();
    Abhishek4 a=new Abhishek4();
    a.poly(obj1);
    a.poly(obj3);

    }
    
}


