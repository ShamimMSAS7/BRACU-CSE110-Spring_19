import java.util.Scanner;
public class A8T3{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int array[]=new int[10];
    for(int i=0; i<array.length; i++){
      System.out.println("Please, enter a number");
      array[i]=sc.nextInt();
    }
    for(int i=array.length-1; i>=0; i--){
      if(i==array.length-1)
        System.out.print(array[i]);
      else
        System.out.print(", "+array[i]);
    }
    System.out.println();
  }
}