import java.util.Scanner;
public class Task11{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of x");
    int x=sc.nextInt();
    System.out.println("Enter the value of y");
    int y=sc.nextInt();
    for(int i=1; i<=y;){
      for(int j=1; j<=x;j++){
        if(i<=y)
          System.out.print((i++)+" ");
      }
      System.out.println();
      
    }
  }
}