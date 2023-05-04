import java.util.Scanner;
public class L7T7{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter quantity");
    double q=sc.nextDouble();
    if(q==0)
      System.out.println();
    else{
      System.out.println("Please, enter a number");
      int num=sc.nextInt();
      int sum=num, max=num, min=num;
      for(int i=2; i<=q; i++){
        System.out.println("Please, enter a number");
        num=sc.nextInt();
        sum+=num;
        if(num>max)
          max=num;
        if(num<min)
          min=num;
      }
      double avg=sum/q;
      
      System.out.println("Maximum is "+max);
      System.out.println("Minimum is "+min);
      System.out.println("Average is "+avg);
    }
  }
}