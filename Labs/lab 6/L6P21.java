import java.util.Scanner;
public class L6P21{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of row");
    int row=sc.nextInt();
    for(int i=1; i<=row; i++){
      for(int j=1; j<=row-i; j++)
        System.out.print(" ");
      for(int j=1; j<=2*i-1; j++){
        if(i==row || j==1 || j==2*i-1)
          System.out.print(j);
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    sc.close();
  }
}  
