import java.util.Scanner;
public class L7T6{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter quantity");
    int q=sc.nextInt();
    for(int i=1; i<=q; i++){
      System.out.println("Please, enter a number");
      int num=sc.nextInt();
      if(num%2==0)
        System.out.println("Even number");
      else
        System.out.println("Odd number");
    }
    
  }
}