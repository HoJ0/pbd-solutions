import java.util.Scanner;

public class ADumbCalculator{
    public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	Double first, second, third, ans;

	System.out.print("What is your first number? ");
	first = keyboard.nextDouble();

	System.out.print("What is your second number? ");
	second = keyboard.nextDouble();

	System.out.print("What is your third number? ");
	third = keyboard.nextDouble();

	ans = (first + second + third) / 2;

	System.out.println("( " + first + " + " + second + " + " + third + " ) / 2 is... " + ans);
    }
}
