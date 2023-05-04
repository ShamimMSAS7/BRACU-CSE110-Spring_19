import java.util.Scanner;
public class L6P8{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of row");
    int row=sc.nextInt();
    for(int i=1; i<=row; i++){
      for(int j=1; j<=row-i; j++)
        System.out.print(" ");
      for(int j=1; j<=i; j++)
        System.out.print(j);
      System.out.println();
    }
    sc.close();
  }
}  
