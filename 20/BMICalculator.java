import java.util.Scanner;

public class BMICalculator{
    public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);

	double feet, inches, pounds, height, bmi;

	System.out.print("Your height (feet only): ");
	feet = keyboard.nextDouble();

	System.out.print("Your height (inches): ");
	inches = keyboard.nextDouble();

	System.out.print("Your weight in pounds: ");
	pounds = keyboard.nextDouble();

	height = inches + (feet * 12);
	bmi = (pounds / (height * height)) * 703;
	bmi = Math.round(bmi * 10.0) / 10.0;

	System.out.print("Your BMI is " + bmi);
    }
}
