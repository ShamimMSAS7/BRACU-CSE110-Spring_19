import java.util.Scanner;
public class A8T2{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int array[]=new int[10];
    for(int i=0; i<=9; i++){
      System.out.println("Please, enter a number");
      array[i]=sc.nextInt();
    }
    System.out.println("Please, enter the number");
    int num=sc.nextInt();
    System.out.println(array[num]);
  }
}