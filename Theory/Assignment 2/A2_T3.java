import java.util.Scanner;
public class A2_T3{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Please, enter your grade of CSE110 ");
     double g1=sc.nextDouble();
     System.out.println("Please, enter your grade of ENG091 ");
     double g2=sc.nextDouble();
     System.out.println("Please, enter your grade of MAT110 ");
     double g3=sc.nextDouble();
     System.out.println("Please, enter your grade of PHY111 ");
     double g4=sc.nextDouble();
     int c1=3;
     int c2=0;
     int c3=3;
     int c4=3;
     Double GPA=(g1*c1+g2*c2+g3*c3+g4*c4)/(c1+c2+c3+c4);
     System.out.println("Your GPA is "+GPA);
     sc.close();
  }
}