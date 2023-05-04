import java.util.Scanner;
public class A4T16{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the mark of a course");
    int mark=sc.nextInt();
    int sum=mark, max=mark, min=mark;
    for(int i=2; i<=10; i++){
      System.out.println("Please, enter the mark of another course");
      mark=sc.nextInt();
      sum+=mark;
      if(mark>max)
        max=mark;
      else if(mark<min)
        min=mark;  
    }
    double avg=sum/10.0;
    System.out.println("Maximum mark is "+max);
    System.out.println("Minimum mark is "+min);
    System.out.println("Average is "+avg);
    sc.close();
  }
}