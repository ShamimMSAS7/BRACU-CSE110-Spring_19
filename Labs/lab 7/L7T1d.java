public class L7T1d{
  public static void main(String[]args){
    int i;
    for(i=18; i<=63; i=i+9){
      if(i==63){
        if(i%2==0)
          System.out.println(i);
        else
          System.out.println("-"+i);
      }else{
        if(i%2==0)
          System.out.print(i+",");
        else
          System.out.print("-"+i+",");
      }
    }
  }
}