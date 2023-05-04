import java.util.Scanner;
public class A2_T8{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Please, enter the number of article ");
     int x=sc.nextInt();
     int fees=x*500;
     System.out.println("Total fees is "+fees+" Tk.");
     sc.close();
  }
}