import java.util.Scanner;
public class A2_T11{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the value of a ");
    int a=sc.nextInt();
    System.out.println("Please, enter the value of b ");
    int b=sc.nextInt();
    int temp=a;
    a=b;
    b=temp;
    System.out.println("a is "+a+" and b is "+b);
    sc.close();
  }
}