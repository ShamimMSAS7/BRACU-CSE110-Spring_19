public class L7T11{
  public static void main(String[]args){
    System.out.println("All prime numbers between 40 and 50 are");
    int temp=0;
    for(int num=40; num<=50; num++){
      int count=0;
      for(int i=1; i<=num; i++){
        if(num%i==0)
          count++;
      }
      if(count==2){
        
        if(temp!=0)
          System.out.print(temp+",");
        temp=num;
      }
    }
    System.out.println(temp);
  }
}
