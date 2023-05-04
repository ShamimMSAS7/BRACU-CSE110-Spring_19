import java.util.Scanner;
public class A2_T14{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the number ");
    int num=sc.nextInt();
    if(num<0){
      num=num*(-1);
    }
    System.out.println("Absolute value of the number is "+num);
    sc.close();
  }
}