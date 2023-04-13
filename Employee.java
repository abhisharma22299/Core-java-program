import java.util.Scanner;

public class Employee {
    static int addTwoNumberWithoutArthematicOperator(int a,int b){

        for (int i=0;i<b;i++){
            a++;
        }

        return a;
    }
    public static void main(String[] args) {

        String employeeName;
        int employeeAge;
        int employeeSalary;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NAME OF THE EMPLOYEE");
        employeeName=sc.next();
        System.out.println("ENTER THE age OF THE EMPLOYEE");
        employeeAge=sc.nextInt(2);
        System.out.println("ENTER THE Salary OF THE EMPLOYEE");
        employeeSalary=sc.nextInt();


        System.out.println("**************************************");

        System.out.println("EMPLOEE NAME :"+employeeName);
        System.out.println("EMPLOEE AGE :"+employeeAge);
        System.out.println("EMPLOEE SALARY :"+employeeSalary);

        employeeName=employeeName.replaceAll("[^a-zA-Z0-9]","");
        employeeName=employeeName.toLowerCase();
        String revString="";

for(int i=employeeName.length()-1;i>=0;i--){
    revString=revString+employeeName.charAt(i);

}
        System.out.println("*******************************************");
      System.out.println(revString);


if (employeeName.equals(revString) ){
  //  System.out.println("THE STRING WHICH YOU WERE ENTER IS A PALINDROME");
}
else{
//    System.out.println("THE STRING WHICH YOU WERE ENTER IS NOT A PALINDROME");
}
        System.out.println("******************************************************");
int a=addTwoNumberWithoutArthematicOperator(20,10);
        System.out.println(a);
    }
}
