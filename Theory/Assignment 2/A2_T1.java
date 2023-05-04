import java.util.Scanner;
public class A2_T1{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Please, enter your mark ");
     double mark=sc.nextDouble();
     if(mark>50){
       System.out.println("Pass");
     }else{
       System.out.println("You shall not pass");
     }
     sc.close();
  }
}