class Fibonacci {
  public static void main(String a[]) {
    int x = 0;
    int y = 1;
    
    while (true)  {
      System.out.println(a);
      
      int tmp = y;
      y += x;
      x = tmp;
    }
  }
}
