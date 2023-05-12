import java.util.Scanner;
public class Task4{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the number");
   
    int array1[]={4, 1, 4, 2,4,67,8,3};
     int num=array1.length;
    int temp=-1;
    for(int i=0; i<array1.length; i++){
      
      if(array1[i]==4)
        temp=i;
    }
    int l=0;
    if(temp!=-1)
      l=num-temp-1;
    int  array2[]=new int[l];
    if(l!=0){
      for(int i=temp+1, j=0; j<array2.length; i++,j++){
        array2[j]=array1[i];
        
      }
    }
    if(l==0)
      System.out.println("Array length 0");
    else{
      for(int i=0; i<array2.length;i++)
        System.out.println(array2[i]);
    }
  }
}