import java.util.Scanner;
public class Task10{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    int value;
    for(int i=1; i<=num*2; i++){
      if(i%2==0)
        value=(num*2-1+(i/2-1)*4);
      else
        value=(int)Math.pow(num-1,(i/2+1));
        
      if(i==1)
        System.out.print(value);
      else
        System.out.print(","+value);
    
    }
  }
}