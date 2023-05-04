import java.util.Scanner;
public class L7T9{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the number");
    int num=sc.nextInt();
    int sum=0;
    for(int i=1; i<num; i++){
      if(num%i==0){
        sum+=i;
      }
    }
    if(sum==num && sum!=0){
      System.out.println("Perfect number");
    }else
      System.out.println("Not perfect number");
  }
}