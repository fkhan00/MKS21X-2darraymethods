public class DriverF extends ArrayMethods
{
  public static void main(String[] args)
  {
  int[][] tester = new int[5][10];
  for (int i = 0; i < tester.length; i++)
  {
    for (int j = 0; j < tester[i].length; j++)
    {
      tester[i][j] = j;
    }
  }
  System.out.println("Testing rowSum");
  System.out.println(rowSum(tester, 3));
  System.out.println("should print 45");
  System.out.println("\n\n\n");
  System.out.println("Testing columnSum");
  System.out.println(columnSum(tester, 2));
  System.out.println("should print out 10");
  System.out.println("\n\n\n");
  System.out.println("Testing isRowMagic");
  System.out.println(isRowMagic(tester));
  System.out.println("should print true");
  System.out.println("\n\n\n");
  System.out.println("Testing isColMagic");
  System.out.println(isColMagic(tester));
  System.out.println("should print false");

}

}
