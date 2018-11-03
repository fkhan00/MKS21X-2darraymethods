public class ArrayMethods
{
  public static int rowSum(int[][] ary, int x)
  {
    int sum = 0;
    for (int i =0; i < ary[x].length; i++)
    {
      sum += ary[x][i];
    }
    return sum;
  }

public static int columnSum(int[][] ary, int x)
{
  int sum = 0;
  for (int i =0; i < ary.length; i ++)
  {
    if (x < ary[i].length)
    {
      sum += ary[i][x];
    }
  }
  return sum;
}

public static int[] allRowSums(int[][] ary)
{
  int[] output = new int[ary.length];
  for (int i = 0; i < ary.length; i++)
  {
    output[i] = rowSum(ary, i);
  }
  return output;
}
public static int[] allColSums(int[][] ary)
{
  int max = 0;
  for(int i = 0; i < ary.length; i++)
  {
    if (ary[i].length > max)
    {
      max = ary[i].length;
    }
  }
  int[] output = new int[max];
  for (int i = 0; i < ary.length; i++)
  {
    output[i] = columnSum(ary, i);
  }
  return output;
}

public static boolean isRowMagic(int[][] ary)
{
  for (int i = 1; i < ary.length; i++)
  {
    int previous = rowSum(ary, i - 1);
    if (rowSum(ary, i) != previous)
    {
      return false;
    }
  }
  return true;
}

public static boolean isColMagic(int[][] ary)
{
  for (int i = 1; i < ary.length; i++)
  {
    int previous = columnSum(ary, i-1);
    if (columnSum(ary, i) != previous)
    {
      return false;
    }
  }
  return true;
}
public void toString(int[][] ary)
{
  String output = "[";
  for (int i = 0; i < ary.length; i++)
  {
    output += "[";
    for (int j = 0; j < ary[i].length; j++)
    {
      output += ("" + ary[i][j]);
    }
    output += "]";
  }
  output += "]";
  System.out.println(output);
}
public void toString(int[] ary)
{
  String output = "[";
  for (int i = 0; i < ary.length; i++)
  {
    output += "" + ary[i];
  }
  output += "]";
  System.out.println(output);
}
}
