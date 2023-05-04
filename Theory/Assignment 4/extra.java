import java.util.Scanner;
public class extra{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the firt value of the range");
    int range1=sc.nextInt();
    System.out.println("Please, enter the last value of the range");
    int range2=sc.nextInt();
    int pri=0;
    for(int num=range1; num<=range2; num++){
      int count=0;
      for(int i=1; i<=num; i++){
        if(num%i==0)
          count++;
      }
      if(count==2)
        pri++;
    }
    System.out.println("Between "+range1+" and "+range2+",");
    System.out.println("Found "+pri+" prime number(s)"); 
  }
}