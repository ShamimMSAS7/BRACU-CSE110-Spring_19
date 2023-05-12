import java.util.Scanner;
public class Task3{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the number");
    int num=sc.nextInt();
    int fib[]=new int[num];
    if(num>0)
      fib[0]=0;
    if (num>1)
      fib[1]=1;
    for(int i=0; i<fib.length; i++){
      if(i<2)
        fib[i]=i;
      else
      {
        fib[i]=fib[i-1]+fib[i-2];
      }
       System.out.println("Fib["+i+"]="+fib[i]);
    }
  }
}