import java.util.Scanner;
public class L6P3{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of row");
    int row=sc.nextInt();
    System.out.println("Enter the number of star(s)");
    int star=sc.nextInt();
    for(int i=1; i<=row;i++){
      for(int j=1; j<=star; j++)
        System.out.print("*");
      System.out.println();
    }
    sc.close();
  }  
}  
