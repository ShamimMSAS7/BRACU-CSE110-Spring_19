import java.util.Scanner;
public class A4T20{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the number");
    int num=sc.nextInt();
    if(num==0)
      System.out.println(num);
    else{
      int rim;
      for(num=num; num>0; num=num/10){
        rim=num%10;
        if (num/10>0)
          System.out.print(rim+", ");
        else
          System.out.println(rim);
      }
    }
    sc.close();
  }
}