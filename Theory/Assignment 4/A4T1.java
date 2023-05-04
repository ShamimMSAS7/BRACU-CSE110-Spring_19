import java.util.Scanner;
public class A4T1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your favourite car's name");
    String car=sc.nextLine();
    System.out.println("enter the times");
    int num=sc.nextInt();
    for(int i=1; i<=num; i++)
      System.out.println(car);
    sc.close();
  }
}