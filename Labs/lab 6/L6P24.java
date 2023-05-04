import java.util.Scanner;
public class L6P24{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the number");
    int num=sc.nextInt();
    for(int i=1; i<=2*num-1; i++){
      if(i<=num)
        System.out.print(i);
      else
        System.out.print(2*num-i);
    }
    System.out.println();
    sc.close();
  }
}