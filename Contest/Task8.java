import java.util.Scanner;
public class Task8{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    int array[]=new int[10];
    array[0]=num;
    for(int i=1; i<array.length; i++){
      array[i]=array[i-1]*2;
    }
    for(int i=0; i<array.length; i++){
      System.out.println("N["+i+"]="+array[i]);
    }
  }
}