import java.util.Scanner;
public class A8T8{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int array[]=new int[10];
    int count=0;
    for(int i=0; i<array.length; i++){
      System.out.println("Please, enter a number");
      array[i]=sc.nextInt();
    }
    for(int i=array.length-1; i>=0; i--){
      if(array[i]%2==0){
        count++;
        if(count==1)
          System.out.print(array[i]);
        else
          System.out.print(", "+array[i]);
      }
    }
    if(count==0)
      System.out.println("You have not enter any even number");
    else
      System.out.println();
  }
}