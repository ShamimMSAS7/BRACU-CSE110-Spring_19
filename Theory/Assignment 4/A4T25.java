import java.util.Scanner;
public class A4T25{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the number");
    int num=sc.nextInt();
    int count=0;
    for(int i=1; i<=num; i++){
      if(num%i==0)
        count++;
    }
    System.out.println("The number of factors of the given number is "+count);
    sc.close();
  }
}