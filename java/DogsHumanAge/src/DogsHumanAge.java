import java.util.Scanner;

public class DogsHumanAge
{
  public static void main(String[] args)
  {
	  String s1 = "abc";
	  String s2 = s1; // new String(s1);
	  
	  if (s1 == s2)
		  System.out.println("");
	  
    Scanner kb = new Scanner(System.in);
    System.out.print(" Enter your dog's age (years): ");
    int dogYears = kb.nextInt();
    System.out.println(dogYears + " dog years roughly corresponds to " +
       convertToHumanAge(dogYears) + " human years.");
  }

  private static int convertToHumanAge(int dogYears)
  {
    return 13 + (int)(16.0 / 3.0 * (dogYears - 1) + 0.5);
  }
}
