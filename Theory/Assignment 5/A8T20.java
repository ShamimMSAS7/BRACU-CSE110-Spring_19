import java.util.Scanner;
public class A8T20{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String array[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    System.out.println("Please, enter the number");
    int num=sc.nextInt();
    for(int i=0; i<array.length; i++){
      if(num==i){
        System.out.println(array[i]);
        i=array.length;
      }
    }
  }
}