import java.util.Scanner;
public class A2_T9{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Please, enter the first number ");
     int x=sc.nextInt();
     System.out.println("Please, enter the second number ");
     int y=sc.nextInt();
     System.out.println("Please, enter the third number ");
     int z=sc.nextInt();
     int l=0;
     if(x>y){
       if(x>z){
         l=x;
       }else{
         l=z;
       }
     }else{
       if(y>z){
         l=y;
       }else{
         l=z;
       }
     }
     System.out.println("The largest number is "+l);
     sc.close();
  }
}