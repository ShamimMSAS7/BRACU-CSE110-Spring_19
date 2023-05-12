import java.util.Scanner;
public class Task5{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    int array1[]={2,3,4,3,56,7};
    
    int temp=-1;
    for(int i=0; i<array1.length;i++){
      if(array1[i]%10==0){
        temp=i;
        break;
      }
    }
    for(int i=temp; i<array1.length;i++){
      if(temp!=-1){
        if(array1[i]%10!=0)
          array1[i]=array1[i-1];
      }
    }
    for(int i=0; i<array1.length;i++)
      System.out.println(array1[i]);
  }
}