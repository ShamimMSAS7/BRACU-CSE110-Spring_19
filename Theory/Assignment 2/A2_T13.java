import java.util.Scanner;
public class A2_T13{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the number of working hour ");
    double hour=sc.nextDouble();
    double sal=0;
    if(hour<=40){
      sal=hour*200;
    }else{
      sal=8000+(hour-40)*300;
    }
    System.out.println("Salary is "+sal+" Tk");
    sc.close();
  }
}