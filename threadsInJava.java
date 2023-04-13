import java.util.Scanner;


class mynn extends Thread{

    public void run(){
        String sc =Thread.currentThread().getName();
        if(sc.equals("call")){
            cal();
        }
        else {
nocal();
        }
    }


    public void cal(){
        System.out.println("IN calsc");


        System.out.println("IN calsc");



        System.out.println("IN calsc");
        System.out.println("IN calsc");
        System.out.println("IN calsc");
    }
    public void nocal(){
        System.out.println("************************");
        System.out.println("************************");
        System.out.println("************************");
        System.out.println("************************");
//        try{
//            Thread.sleep(5000);
//        }
//        catch (Exception e){
//
//
//            System.out.println("SOMETHING WENT WRONG:");
//        }
//        System.out.println("************************");
//
//        try{
//            Thread.sleep(5000);
//        }
//        catch (Exception e){
//
//
//            System.out.println("SOMETHING WENT WRONG:");
//        }
        System.out.println();
        System.out.println("************************");

    }
}
class Myth implements Runnable{


public void run(){
    System.out.println("**********************************************");
    System.out.println("InMyth");

    Scanner sc =new Scanner(System.in);

    int a =sc.nextInt();
    System.out.println("**********************************************");
    System.out.println("**********************************************");
    System.out.println("**********************************************");
    System.out.println("**********************************************");
}

}

class Myth2 implements Runnable{


public void run(){
    System.out.println("**********************************************");

    System.out.println("InMyth22");

    System.out.println("**********************************************");
    System.out.println("**********************************************");
    System.out.println("**********************************************");
    System.out.println("**********************************************");
    System.out.println("**********************************************");
    System.out.println("**********************************************");
    System.out.println("**********************************************");
    System.out.println("**********************************************");
}
}
class MyThread extends Thread {



    public void run(){
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[5] ;
        for (int i =0;i<5;i++){
            System.out.println("Enter A Number");
       arr[i]=sc.nextInt();

        }

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
}class MyThread2 extends Thread {



    public void run(){
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[5] ;
        for (int i =0;i<5;i++){

            System.out.println("NEW WORLD");
        }


        System.out.println("HELLO ABHISHEK");
        System.out.println("HELLO ABHISHEK");
        System.out.println("HELLO ABHISHEK");
        System.out.println("HELLO ABHISHEK");
        System.out.println("HELLO ABHISHEK");
        System.out.println("HELLO ABHISHEK");
        System.out.println("HELLO ABHISHEK");
        System.out.println("HELLO ABHISHEK");
        System.out.println("HELLO ABHISHEK");
        System.out.println("HELLO ABHISHEK");
        System.out.println("HELLO ABHISHEK");
        System.out.println("HELLO ABHISHEK");
         }
}

public class threadsInJava {


    public static void main(String[] args){


//        System.out.println("IN MAIN thread in java");
//        System.out.println(Thread.currentThread());
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
///// changing of name or priotitroy of a thread.
//
//        Thread obj =Thread.currentThread();
//        obj.setName("abhishek sharma ");
//        obj.setPriority(1);
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(Thread.currentThread().getName());

//        System.out.println("IN MAIN THREAD");
//        System.out.println("IN MAIN THREAD");
//        System.out.println("IN MAIN THREAD");
//        System.out.println("IN MAIN THREAD");
//        System.out.println("IN MAIN THREAD");

//        try{
//            Thread.sleep(5000);
//        }
//        catch (Exception e){
//            System.out.println("SOMETHING WENT WRONG");
//        }
//        System.out.println("IN MAIN THREAD");
//        System.out.println("IN MAIN THREAD");
//        System.out.println("IN MAIN THREAD");
//        System.out.println("IN MAIN THREAD");
//        System.out.println("IN MAIN THREAD");
//        System.out.println("IN MAIN THREAD");
//        System.out.println("IN MAIN THREAD");
//
//
//
//
//        MyThread obj=new MyThread();
//        MyThread2 obj2=new MyThread2();
//
//
//        obj.start();
//        obj.start();



//Myth obj =new Myth();
//Myth2 obj2 =new Myth2();
//
//Thread t1=new Thread(obj);
//Thread t2=new Thread(obj2);
//
//t1.start();
//t2.start();


mynn ob =new mynn();
mynn ob21 =new mynn();
ob.isAlive();
ob.setName("call");
ob21.setName("call22");

    ob.start();
//
//ob.join();
    ob.start();
ob.isAlive();


    }
}
