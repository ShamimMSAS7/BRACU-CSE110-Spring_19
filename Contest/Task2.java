import java.util.Scanner;
public class Task2{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the number");
    int num=sc.nextInt();
    for(int i=1; i<=num;i++){
      System.out.println(i+" "+(i*i)+" "+(i*i*i));
      System.out.println(i+" "+(i*i+1)+" "+(i*i*i+1));
    }
  }
}