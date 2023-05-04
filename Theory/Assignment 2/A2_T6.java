import java.util.Scanner;
public class A2_T6{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Please, enter the value of S ");
     double S=sc.nextDouble();
     double L=0;
     if(S<100){
       L=3000-125*S*S;
     }else{
       L=12000/(4+S*S/14900);
     }
     System.out.println("The value of L is "+L);
     sc.close();
  }
}