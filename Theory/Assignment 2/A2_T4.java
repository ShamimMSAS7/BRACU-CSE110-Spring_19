import java.util.Scanner;
public class A2_T4{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Please, enter your age ");
     int age=sc.nextInt();
     System.out.println("Please, enter your salary ");
     int sal=sc.nextInt();
     double tax=0;
     if(age<18){
     }else if(sal<10000){
     }else if(sal<=20000){
       tax=sal*5/100;
     } else{
       tax=sal*10/100;
     }
     System.out.println("Your tax is "+tax);
     sc.close();
  }
}