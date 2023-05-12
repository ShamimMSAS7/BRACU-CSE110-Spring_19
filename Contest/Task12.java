import java.util.Scanner;
public class Task12{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    for(int i=1; i<=num; i++){
      for(int j=1; j<i; j++)
        System.out.print(" ");
      for(int j=1; j<=(num-i+1)*2-1; j++)
        System.out.print("*");
      System.out.println();
    }
    for(int i=2; i<=num; i++){
      for(int j=1; j<=num-i; j++)
        System.out.print(" ");
      for(int j=1; j<=i*2-1; j++)
        System.out.print("*");
      System.out.println();
    }
  }
}