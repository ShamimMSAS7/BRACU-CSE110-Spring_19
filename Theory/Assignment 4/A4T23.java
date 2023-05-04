import java.util.Scanner;
public class A4T23{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the number");
    int num=sc.nextInt();
    if(num==0)
      System.out.println("Zero");
    else{
      int c=10;
      for(c=c; num/c>0; ){
        c=c*10;
      }
      c=c/10;
      int s;
      for(c=c; c>0; c/=10){
        s=num/c;
        num=num%c;
        if(c/10>0){
          if(s==0)
            System.out.print("Zero, ");
          else if(s==1)
            System.out.print("One, ");
          else if(s==2)
            System.out.print("Two, ");
          else if(s==3)
            System.out.print("Three, ");
          else if(s==4)
            System.out.print("Four, ");
          else if(s==5)
            System.out.print("Five, ");
          else if(s==6)
            System.out.print("Six, ");
          else if(s==7)
            System.out.print("Seven, ");
          else if(s==8)
            System.out.print("Eight, ");
          else
            System.out.print("Nine, ");
        }else{
          if(s==0)
            System.out.println("Zero");
          else if(s==1)
            System.out.println("One");
          else if(s==2)
            System.out.println("Two");
          else if(s==3)
            System.out.println("Three");
          else if(s==4)
            System.out.println("Four");
          else if(s==5)
            System.out.println("Five");
          else if(s==6)
            System.out.println("Six");
          else if(s==7)
            System.out.println("Seven");
          else if(s==8)
            System.out.println("Eight");
          else if(s==9)
            System.out.println("Nine");
        }  
      }
    }
    sc.close();
  }
}