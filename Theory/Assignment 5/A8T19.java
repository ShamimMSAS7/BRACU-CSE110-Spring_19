import java.util.Scanner;
public class A8T19{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int array[]= new int[10];
    for(int i=0; i<array.length; i++){
      System.out.println("Please, enter a number");
      array[i]=sc.nextInt();
    }
    for(int i=0; i<array.length; i=i+2){
      if(i==0)
        System.out.print(array[i]);
      else
        System.out.print(", "+array[i]);
    }
    for(int i=1; i<array.length; i=i+2)
      System.out.print(", "+array[i]);
    System.out.println();
  }
}
