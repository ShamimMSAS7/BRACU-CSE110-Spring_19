import java.util.Scanner;
public class A4T4{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int sum=0;
    double count=0;
    for(int i=1; i<=8; i++){
      System.out.println("Please, enter the number");
      int num=sc.nextInt();
      if(num%2==0){
        sum+=num;
        int min=num;
        count=1;
        for(i=i+1; i<=8; i++){
          System.out.println("Please, enter the number");
          num=sc.nextInt();
          if(num%2==0){
            count++;
            sum+=num;
            if(num<min)
              min=num;
          } 
        }
        double avg=sum/count;
        System.out.println("Average is "+avg);
        System.out.println("Minimum number is "+min);
      }
    }
    if(count==0)
      System.out.println("You haven't enter a single even number");
    sc.close();
  }
}