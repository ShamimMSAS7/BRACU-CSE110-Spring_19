import java.util.Scanner;
public class A2_T17{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the number");
    int num=sc.nextInt();
    if(num>10 && num%2==0){
      System.out.println("An even number greater than 10");
    }else if(num>10 && num%2!=0){
      System.out.println("An odd number greater than 10");
    }else if(num<=10 && num%2==0){
      System.out.println("An even number not greater than 10");
    }else{
      System.out.println("An odd number less than 10");
    }
    sc.close();
  }
}
