import java.util.Scanner;
public class A4T3{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the number");
    int num=sc.nextInt();
    int max=num, sum=num;
    for (int i=2; i<=7; i++){
      System.out.println("Please, enter the next number");
      num=sc.nextInt();
      sum+=num;
      if(num>max)
        max=num;
    }
    double avg=sum/7.0;
    System.out.println("Average is "+avg);
    System.out.println("Maximum number is "+max);
    sc.close();
  }
}