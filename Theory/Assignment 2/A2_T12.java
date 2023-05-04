import java.util.Scanner;
public class A2_T12{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the value of a ");
    int a=sc.nextInt();
    System.out.println("Please, enter the value of b ");
    int b=sc.nextInt();
    System.out.println("Please, enter the value of c ");
    int c=sc.nextInt();
    System.out.println("Please, enter the value of d ");
    int d=sc.nextInt();
    int temp=a;
    a=b;
    b=c;
    c=d;
    d=temp;
    System.out.println("a is "+a+" , b is "+b+" , c is "+c+" and d is "+d);
    sc.close();
  }
}
