import java.util.Scanner;
public class A4T21{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the number");
    int num=sc.nextInt();
    if(num==0)
      System.out.println(num);
    else{
      int c=10;
      for(c=c; num/c>0; ){
        c=c*10;
      }
      c=c/10;
      int s;
      for(c=c; c>0; c/=10){
        s=num/c;
        num=num%c;
        if(c/10>0)
          System.out.print(s+", ");
        else
          System.out.println(s);
      }
    }
    sc.close();
  }
}