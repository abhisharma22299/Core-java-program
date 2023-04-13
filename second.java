import java.util.HashSet;

public class second {
    static void printArray(int arr[]){
        System.out.println("PRINTING THE ARRAY");
        for (int i=0;i<arr.length;i++)
        {

            System.out.println(arr[i]);
        }
        System.out.println(" ENDING OF THE  ARRAY");
    }
//    static void printPrimeNumber(int min,int max){
//
//      for (int i =0;i<100;i++) {
//          if (is(i)) {
//              System.out.println(i);
//
//          }
//      }
//    }
//    static boolean is(int n){
//        for (int i=1;i<100;i++){
//            if(n==0){
//
//            }
//        }
//        return false;
//    }
    static void slectionSorting(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length;j++){
                if(i<j){

                }
            }
        }
    }
    static void bubbleSort(int arr[]){
// int arr[]={10,40,6,20,30};
        int a;
        for(int i=0;i<arr.length-1;i++){

            for (int j=1;j<arr.length-i-1;j++){
                if(arr[i]>arr[i+1]){
                    int temp= arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        HashSet<Integer> objOfArrayList=new HashSet<>(12,0.5f);
    objOfArrayList.add(90);
objOfArrayList.add(12);
objOfArrayList.add(828);
objOfArrayList.remove(2);
objOfArrayList.add(32);

     //   System.out.println(objOfArrayList);
//for (int i=0;i<objOfArrayList.size();i++){
//    System.out.println(objOfArrayList.(i));
//
//
//}
//        System.out.println("PRINTING THE CURRENT HOURS SINCE 1970");
//        System.out.println(System.currentTimeMillis()/1000/3600/24);
//
//        Calendar c= Calendar.getInstance();
//
//        System.out.println(c.getTime());
 //<--------BUBBLE SORTING TECHNIQUE------------->

   //creating a array .
        int arr[]={10,4,6,20,30};
       // bubbleSort(arr);

//printPrimeNumber(1,100);
    }
    }
