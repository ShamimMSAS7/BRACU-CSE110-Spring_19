import java.util.Scanner;
public class A8T9{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int array[]=new int[10];
    int count=0;
    for(int i=0; i<array.length; i++){
      System.out.println("Please, enter a number");
      array[i]=sc.nextInt();
    }
    System.out.println("Please, enter the number of checking");
    int num=sc.nextInt();
    for(int i=0; i<array.length; i++){
      if(num==array[i]){
        count++;
        System.out.println("Yes");
        break;
      }
      
    }
    if(count==0)
      System.out.println("No");
  }
}