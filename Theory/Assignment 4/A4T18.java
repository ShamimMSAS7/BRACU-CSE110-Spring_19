import java.util.Scanner;
public class A4T18{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter a number");
    int num=sc.nextInt();
    int c=0;
    if(num==0)
      c=1;
    else{
    for(num=num;num>0;num/=10){
      c++;
    }
    }
    System.out.println("There are "+c+" digit(s) in the number");
    sc.close();
  }
}