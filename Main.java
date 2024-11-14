import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int count = countSub("gagagigo the risen", "risen");
    System.out.println(count);
  }

  public static int countSub(String word, String target)
  {
    int len = target.length();
    String a = "";
    int count = 0;
    for (int i = 0; i < word.length()-(len-1); i++)
    {
      a = word.substring(i, len + i);
      System.out.println(a);
      if (a.equals(target))
      {
        count++;
      }
    }
    return count;
  }

  public static int countProperContains(String word, String target)
  {
    int count = 0;
    int len = target.length();
    for (int i = 0; i < word.length() - (target.length() - 1); i++)
    {
      String a = word.substring(i, i + len);
      if (a.equals(target))
      {
        int start = i; 
        int end = i + len;
        boolean startSpace = (start == 0 || word.substring(start-1, start).equals(" "));
        boolean endSpace = (end == word.length() || word.substring(end, end + 1).equals(" ")); //
        if (startSpace && endSpace)
        {
          count++;
        }
      }
    }
    return 0;
  }

  public static String deleteSub(String word, String target)
  {
    return null;
  }
  public static String p0(String word, String target)
  {
    if (target.contains(word)) {
      String a = target.substring(0, target.indexOf(word));
      String b = target.substring(target.indexOf(word) + word.length(), target.length());
      a += b;
      return a;
    }
    else {
    return "word not present";
    }
}
}
