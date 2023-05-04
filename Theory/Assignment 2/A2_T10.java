import java.util.Scanner;
public class A2_T10{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the name of your favourite car");
    String car=sc.nextLine();
    int i=1;
    while(i<=4){
      System.out.println(car);
      i++;
    }
    sc.close();
  }
}