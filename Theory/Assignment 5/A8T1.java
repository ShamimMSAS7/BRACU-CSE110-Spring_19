import java.util.Scanner;
public class A8T1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int array[]=new int[3];
    int sum=0;
    for(int i=0; i<=2; i++){
      System.out.println("Please, enter a number");
      array[i]=sc.nextInt();
      sum=sum+array[i];
    }
    System.out.print(sum);
    for(int i=0; i<=2; i++)
      System.out.print(", "+array[i]);
    System.out.println();
  }
}