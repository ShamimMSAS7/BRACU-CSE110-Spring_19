import java.util.Scanner;
public class A4T30{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the firt value of the range");
    int range1=sc.nextInt();
    System.out.println("Please, enter the last value of the range");
    int range2=sc.nextInt();
    int pri=0, per=0;
    for(int num=range1; num<=range2; num++){
      int count=0, sum=0;
      for(int i=1; i<=num/2; i++){
        if(num%i==0){
          sum+=i;
          count++;
        }
      }
      if(sum==num && sum!=0)
        per++;
      if(count==1)
        pri++;
    }
    System.out.println("Between "+range1+" and "+range2+",");
    System.out.println("Found "+pri+" prime number(s)"); 
    System.out.println("Found "+per+" perfect number(s)");
    sc.close();
  }
}