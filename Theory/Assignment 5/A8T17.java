import java.util.Scanner;
public class A8T17{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the quantity");
    int quan=sc.nextInt();
    int array[]=new int[quan];
    for(int i=0; i<array.length; i++){
      System.out.println("Please, enter a number");
      array[i]=sc.nextInt();
    }
    for(int i=0; i<array.length; i++){
      for(int j=i+1; j<array.length; j++){
        if(array[j]<array[i]){
          int temp=array[i];
          array[i]=array[j];
          array[j]=temp;
        }
      }
    }
    int med;
    if(quan%2==0)
      med=(array[quan/2]+array[quan/2-1])/2;
    else
      med=array[quan/2];
    System.out.println(med);
  }
}