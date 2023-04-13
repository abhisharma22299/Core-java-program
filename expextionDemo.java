//import java.
public class expextionDemo {
    public static void main(String[] args) {

        Ba obj =new Ba();
        try {
            obj.a();
        }
        catch (Exception ob){
            System.out.println(ob);
        }


    }
}
class Ba{
    public void a() throws Exception{
        b();
    }
    public void b() throws Exception{
        int a,b;
        a=2;
        b=1;
        int res=0;
            res=a/b;

            System.out.println(res);


        }
}
