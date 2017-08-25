class Fibonacci {
  public static void main(String a[]) {
    int x = 0;
    int y = 1;
    
    int stop = 20;
    
    for (int index = 0; index < stop; index++)  {
      System.out.println(a);
      
      int tmp = y;
      y += x;
      x = tmp;
    }
  }
}
