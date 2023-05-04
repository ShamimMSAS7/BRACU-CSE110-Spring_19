import java.util.Scanner;
public class A8T11{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int array[]=new int[10];
    for(int i=0; i<array.length; i++){
      System.out.println("Please, enter a number");
      array[i]=sc.nextInt();
      for(int j=0; j<i; j++){
        if(array[i]==array[j]){
          System.out.println("This number has already been entered. please, enter another number");
          array[i]=sc.nextInt();
          j=-1;
        }
      }
    }
  }
}
