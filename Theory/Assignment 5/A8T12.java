import java.util.Scanner;
public class A8T12{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int array[]=new int[5];
    for(int i=0; i<array.length; i++){
      System.out.println("Please, enter a number");
      array[i]=sc.nextInt();
    }
    int max=array[0];
    for(int i=1; i<array.length; i++){
      if(array[i]>max)
        max=array[i];
    }
    System.out.println(max);
  }
}