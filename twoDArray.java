import java.util.Scanner;

public class twoDArray {

    static void print2DArrayWithForEachLoops(int arr[][]){

        for (int a[]:arr){
            for (int b: a){
                System.out.println(b);
            }
        }
    }

    static void printArrayTwoDWithInhancedForLoops(int n[][] ) {

        for (int i[] : n) {
            for (int j :i){
                System.out.print(j +" ") ;

            }
            System.out.println();
        }
    }
    static  void printATwoDArray(int arr[][]){
        System.out.println("*****************************************************************");
        System.out.println("PRINTING A TWO DIMENSIONAL ARRAY");

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
                System.out.print("\t");
            }
            System.out.println("");

        }
        System.out.println("*****************************************************************");
    }
    static void multiplicationOfTwoDArray(int arr[][],int arr2[][]){
 int sum[][] = new int[2][2];

     //   System.out.println("*****************************************************************");
int r=0,j;
        for (int i=0;i<arr.length;i++){

            for ( j=0;j<arr.length;j++){

                for (int k=0;k<arr.length;k++)

        r=r+arr[i][k]*arr2[j][i]+sum[k][j];

            }

sum[i][j]=r; 
        }
        printATwoDArray(sum);
   //     System.out.println("*****************************************************************");
    }
    static int[][] creatingAArray(){
        System.out.println("*****************************************************************");

        int n=2;
        int arr[][] = new int[2][2];
        Scanner obj =new Scanner(System.in);

        System.out.println("ENTER THE ARAY ELEMENT");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                arr[i][j]=obj.nextInt();
            }

        }
        System.out.println("*****************************************************************");
        return arr;
    }
    public static void main(String[] args) {
        // create a 2 d array

      //  printATwoDArray(arr);
      //  int arr[][]=creatingAArray();
       // int arr2[][]=creatingAArray();

   // multiplicationOfTwoDArray(arr,arr2);
        int arr2[][]={{1,2,3},{2,3,3}};
       // printArrayTwoDWithInhancedForLoops(arr);
   print2DArrayWithForEachLoops(arr2);

    }

}
