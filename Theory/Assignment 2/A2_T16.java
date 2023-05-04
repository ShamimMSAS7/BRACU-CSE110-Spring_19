import java.util.Scanner;
public class A2_T16{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the start hour in 24 hour format");
    int sh=sc.nextInt();
    System.out.println("Please, enter the start minute");
    int sm=sc.nextInt();
    System.out.println("Please, enter the end hour in 24 hour format");
    int eh=sc.nextInt();
    System.out.println("Please, enter the end minute");
    int em=sc.nextInt();
    if(em<sm){
      em=em+60;
      sh++;
    }
    if(eh<sh){
      eh=eh+24;
    }
    int time=(eh-sh)*60+em-sm;
    System.out.println("Please, if it is F&F type number, enter 1 otherwise enter 2");
    int type=sc.nextInt();
    System.out.println("Please, if it is Peak Hour, enter 1 otherwise enter 2");
    int hour=sc.nextInt();
    int charge=0;
    if(type==1){
      if(hour==1){
        if(time>5){
          charge=5*4+(time-5)*2;
        }else{
          charge=time*4;
        }
      }else if(hour==2){
        if(time>5){
          charge=5*3+(time-5)*1;
        }else{
          charge=time*3;
        }
      }
    }else if(type==2){
     if(hour==1){
        if(time>5){
          charge=5*7+(time-5)*6;
        }else{
          charge=time*7;
        }
      }else if(hour==2){
        if(time>5){
          charge=5*8+(time-5)*5;
        }else{
          charge=time*8;
        }
      }
    }
    System.out.println("Call charge is "+charge+" Tk");
    sc.close();
  }
}