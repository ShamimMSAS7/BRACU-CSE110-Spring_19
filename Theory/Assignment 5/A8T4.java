import java.util.Scanner;
public class A8T4{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int array[]=new int[10];
    int odd=2;
    for(int i=0; i<array.length; i++){
      System.out.println("Please, enter a number");
      array[i]=sc.nextInt();
    }
    for(int i=0; i<array.length; i++){
      if(array[i]%2!=0){
        odd=array[i];
        i=array.length;
      }
    }
    if(odd==2)
      System.out.println("You have not enter any odd number");
    else
      System.out.println(odd);
  }
}