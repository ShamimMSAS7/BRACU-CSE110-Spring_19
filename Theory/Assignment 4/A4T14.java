import java.util.Scanner;
public class A4T14{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the quantity");
    int quan=sc.nextInt();
    int pro=1;
    for(int i=1; i<=quan; i++){
      System.out.println("Enter the number");
      int num=sc.nextInt();
      pro*=num;
    }
    System.out.println("Product is "+pro);
    sc.close();
  }
}