import java.util.Scanner;
public class A2_T2{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Please, enter your mark ");
     int mark=sc.nextInt();
     if(mark>=0){
       if(mark<50){
         System.out.println("F");
       }else if(mark<60){
         System.out.println("E");
       }else if(mark<70){
         System.out.println("D");
       }else if(mark<80){
         System.out.println("C");
       }else if(mark<90){
         System.out.println("B");
       }else if(mark<=100){
         System.out.println("A");
       }else{
         System.out.println("Wrong Input");
       }
     }else{
       System.out.println("Wrong Input");
     }
     sc.close();
  }
}