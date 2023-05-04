import java.util.Scanner;
public class A8T7{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int array[]=new int[10];
    int even=1;
    for(int i=0; i<array.length; i++){
      System.out.println("Please, enter a number");
      array[i]=sc.nextInt();
    }
    for(int i=array.length-1; i>=0; i--){
      if(array[i]%2==0){
        even=array[i];
        i=-1;
      }
    }
    if(even==1)
      System.out.println("You have not enter any even number");
    else
      System.out.println(even);
  }
}