public class A4T27{
  public static void main(String[]args){
    int temp=0;
    System.out.println("Prime numbers less than 1000 are");
    for(int num=1; num<=1000; num++){
      int count=0;
      for(int i=1; i<=num; i++){
        if(num%i==0)
          count++;
      }
      if(count==2){
        if(temp!=0)
          System.out.print(temp+", ");
        temp=num;
      }
    }
    System.out.println(temp);
  }
}