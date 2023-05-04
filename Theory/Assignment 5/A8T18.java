import java.util.Scanner;
public class A8T18{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int array[]= new int[15];
    for(int i=0; i<array.length; i++){
      System.out.println("Please, enter a number between 0 and 9");
      array[i]=sc.nextInt();
      for(int j=1; j>0; j++){
        if(array[i]<0 || array[i]>9){
          System.out.println("Previous input is invalid. Please, enter again a number between 0 and 9");
          array[i]=sc.nextInt();
        }else
          j=-1;
      }
    }
    for(int i=0; i<=9; i++){
      int count=0;
      for(int j=0; j<array.length; j++){
        if(i==array[j])
          count++;
      }
      System.out.println(i+" is enterd "+count+" time(s)");
    }
  }
}
