import java.util.Scanner;
public class A4T22{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter a number between 0 and 9");
    int num=sc.nextInt();
    if(num==0)
      System.out.println("Zero");
    else if(num==1)
      System.out.println("One");
    else if(num==2)
      System.out.println("Two");
    else if(num==3)
      System.out.println("Three");
    else if(num==4)
      System.out.println("Four");
    else if(num==5)
      System.out.println("Five");
    else if(num==6)
      System.out.println("Six");
    else if(num==7)
      System.out.println("Seven");
    else if(num==8)
      System.out.println("Eight");
    else if(num==9)
      System.out.println("Nine");
    else
      System.out.println("Invalid input");
    sc.close();
  }
}