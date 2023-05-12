import java.util.Scanner;
public class Task6{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the age in days");
    int days=sc.nextInt();
    int months=days/30;
    days=days%30;
    int years=months/12;
    months=months%12;
    System.out.println(years+" Year(s),"+months+" Month(s),"+days+ " Day(s).");
    }
  }
