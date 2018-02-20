public class VariablesAndPrinting{
    public static void main(String[] args){
        String name, eyes, teeth, hair;
        int age, kg, cm, pounds;
	double inches;

        name = "Joffee Ho";
        age = 18;     
        inches = 66.9;  
        kg = 56; 
        eyes = "Dark brown";
        teeth = "White";
        hair = "Brown";
	cm = (int) (inches / 0.39370);
	pounds = (int) (kg * 2.2046);

        System.out.println("My name is " + name + ".");
        System.out.println("I'm " + cm + " cm tall.");
        System.out.println("I'm " + pounds + " pounds heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("I have " + eyes + " eyes and " + hair + " hair.");
        System.out.println("My teeth are usually " + teeth);

        System.out.println("If I add " + age + ", " + cm + ", and " + pounds + " I get " + (age + cm + pounds) + ".");
    }
}
