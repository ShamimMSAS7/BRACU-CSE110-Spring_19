import java.util.Scanner;
public class A8T14{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int array[]=new int[5];
    for(int i=0; i<array.length; i++){
      System.out.println("Please, enter a number");
      array[i]=sc.nextInt();
    }
    int max=array[0],min=array[0];
    for(int i=1; i<array.length; i++){
      if(array[i]>max)
        max=array[i];
      if(array[i]<min)
        min=array[i];
    }
    int locMax=0, locMin=0;
    for(int i=0; i<array.length; i++){
      if(max==array[i])
        locMax=i;
      if(min==array[i])
        locMin=i;
    }
    System.out.println("largest number "+max+" was found at location "+locMax);
    System.out.println("Smallest number "+min+" was found at location "+locMin);
  }
}