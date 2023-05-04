import java.util.Scanner;
public class L6P25{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of row");
    int row=sc.nextInt();
    for(int i=1; i<=row; i++){
      for(int j=1; j<=row-i; j++)
        System.out.print(" ");
      for(int j=1; j<=2*i-1; j++){
        if(j<=i)
          System.out.print(j);
        else
          System.out.print(2*i-j);
      }
      System.out.println();
    }
    sc.close();
  }
}  
