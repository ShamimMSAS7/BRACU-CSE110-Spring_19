import java.util.Scanner;
public class A4T24{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the number");
    int num=sc.nextInt();
    for(int i=1; i<=num; i++){
      if(i!=num)
        System.out.print(i+", ");
      else
        System.out.println(i);
    }    
    sc.close();
  }
}