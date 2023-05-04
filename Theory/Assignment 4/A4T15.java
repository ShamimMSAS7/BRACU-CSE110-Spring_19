import java.util.Scanner;
public class A4T15{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int sum=0;
    for(int i=1; i<=20; i++){
      System.out.println("Please, enter a number");
      int num=sc.nextInt();
      sum+=num;
      System.out.println("Sum of the first "+i+" number(s) are "+sum);
    }
    sc.close();
  }
}