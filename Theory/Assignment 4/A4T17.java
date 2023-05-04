public class A4T17{
  public static void main(String[]args){
    System.out.println("All Fibonacci numbers that are less than 1600 are");
    int n1=0, n2=1;
    int temp;
    for(n2=n2;n2<=1600;n2=n1+temp){
      System.out.print(n1+", ");
      temp=n1;
      n1=n2;
    }
    System.out.println(n1);
  }
}