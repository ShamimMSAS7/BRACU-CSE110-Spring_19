import java.util.Scanner;
public class L6P2{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of star(s)");
    int star=sc.nextInt();
    for(int i=1; i<=star;i++)
      System.out.print("*");
    System.out.println();
    sc.close();
  }
}  
