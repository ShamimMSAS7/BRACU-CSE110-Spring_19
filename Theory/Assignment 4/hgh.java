import java.util.Scanner;
public class hgh{
  public static void main(String[]args){
    int sum=1;
    Scanner dm=new Scanner(System.in);
    System.out.println("Please, enter the number");
    int num=dm.nextInt();
    sum=num*10;
    System.out.println(sum);
    Scanner em=new Scanner(System.in);
    double num1=em.nextDouble();
    num1=num*10;
    System.out.println(num1);
    em.close();
    dm.close();
  }
}