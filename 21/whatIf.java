public class whatIf {
    public static void main(String[] args) {
        int people = 25;
        int cats = 25;
        int dogs = 20;
        
        if (people < cats) { // output message when the amount of people is less than cats
          System.out.println("Too many cats!  The world is doomed!");
        }
        
        if (people > cats) { // output message when the amount of people is greater than cats
          System.out.println("Not many cats!  The world is saved!");
        }
        
        if (people < dogs) { // output message when the amount of people is less than dogs
          System.out.println("The world is drooled on!");
        }
        
        if (people > dogs) { // output message when the amount of people is greater than dogs
          System.out.println("The world is dry!");
        }
        
        dogs += 5; // add 5 to the amount of dogs
        
        if (people >= dogs) { // output message when the amount of people greater than or equal to dogs
          System.out.println("People are greater than or equal to dogs.");
        }
        
        if (people <= dogs) { // output message when the amount of people less than or equal to dogs
          System.out.println("People are less than or equal to dogs.");
        }
        
        if (people == dogs) { // output message when the amount of people is equal to dogs
          System.out.println("People are dogs.");
        }
    }
}
