import java.util.Scanner;
public class L6P4{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of row");
    int row=sc.nextInt();
    System.out.println("Enter the amount of number(s)");
    int num=sc.nextInt();
    for(int i=1; i<=row;i++){
      for(int j=1; j<=num; j++)
        System.out.print(j);
      System.out.println();
    }
    sc.close();
  }
}  
