import java.util.Scanner;
public class L6P17{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of row");
    int row=sc.nextInt();
    for(int i=1; i<=row; i++){
      for(int j=1; j<=i; j++){
        if(i==row || j==1 || j==i)
          System.out.print(j);
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    sc.close();
  }
}  
