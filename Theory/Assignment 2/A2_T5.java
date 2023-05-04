import java.util.Scanner;
public class A2_T5{
  public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Please, enter the duration in seconds ");
     int sec=sc.nextInt();
     int hours=sec/3600;
     sec=sec%3600;
     int min=sec/60;
     sec=sec%60;
     if(hours>1){
       System.out.println(hours+" Hours");
     }else{
       System.out.println(hours+" Hour");
     }
     if(min>1){
       System.out.println(min+" Minutes");
     }else{
       System.out.println(min+" Minute");
     }
     if(sec>1){
       System.out.println(sec+" Seconds");
     }else{
       System.out.println(sec+" Second");
     }
     sc.close();
  }
}