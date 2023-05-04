import java.util.Scanner;
public class A4T5{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of N");
    int n=sc.nextInt();
    int sum=0;
    for(int i=1; i<=n; i++){
      sum=sum+i*i*i;
    }
    double Y=Math.pow(sum,1.0/3);
    System.out.println("The value of Y is "+Y);
    sc.close();
  }
}