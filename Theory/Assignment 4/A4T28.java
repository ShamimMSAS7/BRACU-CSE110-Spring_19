import java.util.Scanner;
public class A4T28{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the number");
    int num=sc.nextInt();
    int sum=0;
    for(int i=1; i<=num; i++){
      if(num%i==0)
        sum+=i;
    }
    System.out.println("Sum of the factors are "+sum);
    sc.close();
  }
}