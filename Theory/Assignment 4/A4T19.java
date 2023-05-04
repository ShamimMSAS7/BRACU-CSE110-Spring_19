import java.util.Scanner;
public class A4T19{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please, enter the power");
    int pow=sc.nextInt();
    double pro=1.0;
    if(pow<0){
      for(int i=-1; i>=pow; i--){
        pro=pro/10;
      }
    }else{
      for(int i=1; i<=pow; i++){
        pro=pro*10;
      }
    }
    System.out.println(pro);
    sc.close();
  }
}