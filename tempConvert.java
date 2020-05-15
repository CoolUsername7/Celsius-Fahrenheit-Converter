import java.util.Scanner;

public class tempConvert{
	public static void main (String[] arg)
	{
//use double because its temperature

	double fahr;
	double celsius;
	Scanner keyboard = new Scanner(System.in);
System.out.print("Degrees in Fahrenheit: ");
fahr = keyboard.nextDouble();
celsius = Math.round((5.0/9.0) * (fahr - 32));
System.out.println("The fahrenheit temperature " + fahr + " in celsius is " + celsius);
}
}

