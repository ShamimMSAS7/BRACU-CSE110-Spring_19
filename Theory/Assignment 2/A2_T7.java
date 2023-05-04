import java.util.Scanner;
public class A2_T7{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Please, enter the value of x ");
     double x=sc.nextDouble();
     System.out.println("Please, enter the value of y ");
     double y=sc.nextDouble();
     System.out.println("Please, enter the value of z ");
     double z=sc.nextDouble();
     double s=(x+y+z)/2;
     double area=Math.sqrt(s*(s-x)*(s-y)*(s-z));
     System.out.println("The area is "+area);
     sc.close();
  }
}