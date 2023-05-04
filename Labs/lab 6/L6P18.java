import java.util.Scanner;
public class L6P18{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of row");
    int row=sc.nextInt();
    for(int i=1; i<=row; i++){
      int j;
      for(j=1; j<=row-i; j++)
        System.out.print(" ");
      for(j=j; j<=row; j++){
        if(i==row || j==row-i+1 || j==row)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    sc.close();
  }
}  
