import java.util.Scanner;
public class A4T13{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of N");
    int n=sc.nextInt();
    int sum=0;
    for(int i=1; i<=n; i++){
      if(i%2!=0)
        sum+=i;
    }
    System.out.println("Sum is "+sum);
    sc.close();
  }
}