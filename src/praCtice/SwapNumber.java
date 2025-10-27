package praCtice;
public class SwapNumber{
  public static void main(String[] args) {
    int a=10;
    int b=20;
    System.out.println("Before swapping two number is: "+a+" "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("Swapped two number is: "+a+" "+b);
    
    
}
