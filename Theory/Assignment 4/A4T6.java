import java.util.Scanner;
public class A4T6{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of N");
    int n=sc.nextInt();
    int Y=0;
    for(int i=1; i<=n; i++){
      if(i%2==0)
        Y-=i*i;
      else
        Y+=i*i;
    }
    System.out.println("The value of Y is "+Y);
    sc.close();
  }
}