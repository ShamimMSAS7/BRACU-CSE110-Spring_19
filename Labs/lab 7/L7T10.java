import java.util.Scanner;
public class L7T10{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the number");
    int num=sc.nextInt();
    int count=0;
    for(int i=1; i<=num; i++){
      if(num%i==0){
        count++;
        
      }
    }
    if(count==2)
      System.out.println("Prime number");
    else
      System.out.println("Not prime number");
  }
}
