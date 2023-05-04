import java.util.Scanner;
public class A2_T19{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the number");
    int num=sc.nextInt();
    if((num%2==0 || num%5==0)&&(num%10!=0)){
      System.out.println(num);
    }
    sc.close();
  }
}
