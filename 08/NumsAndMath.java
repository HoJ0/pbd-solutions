public class NumsAndMath{
    public static void main(String[] args){
	
	System.out.println("I will now count my chickens:");

	// Counting hens and roosters
	System.out.println("Hens " + ( 25.0 + 30 / 6 ));
	System.out.println("Roosters " + ( 100 - 25.0 * 3 % 4 ));

	// Tell user what is going on
	System.out.println("Now I will count the eggs:");

	// Egg counting
	System.out.println(3 + 2 + 1 - 5.0 + 4 % 2 - 1 / 4 + 6);

	// Ask a question
	System.out.println("Is it true that 3 + 2 < 5 - 7?");

	// Check the boolean
	System.out.println(3 + 2 < 5 - 7);

	// Question and answer
	System.out.println("What is 3 + 2? " + ( 3.0 + 2 ));
	System.out.println("What is 5 - 7? " + ( 5.0 - 7 ));

	System.out.println("Oh, that's why it's false.");
	System.out.println("How about some more.");

	// Tells if it's greater, greater or equal, or less or equal
	System.out.println("Is it greater? " + ( 5 > -2 ));
	System.out.println("Is it greater or equal? " + ( 5 >= -2 ));
	System.out.println("Is it less or equal? " + ( 5 <= -2 ));
    }
}
