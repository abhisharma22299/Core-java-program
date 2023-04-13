class inn
{
    class inn2
    {
    }
}


interface cc{
    void show();
}

interface F{
int a=0;
}
interface B extends F{
    int d=1;
}
class J implements B{
    int c=2;

}
class S extends J implements F,B{
    int b=3;
}


public class InterfaceDemo {


        public static void main(String[] args) {

          //  S obj =new S();
        //    System.out.println(obj.d);
          //  inn obj =new inn();
        //    inn.inn2 obj2 =obj.new inn2();
    cc obj =new cc(){
        public void show(){

            System.out.println("driving");
        }
    };
    obj.show();

            cc obj2 =()->{
// amadaL expression

                    System.out.println("driving");};


       obj2.show();
        }



}
