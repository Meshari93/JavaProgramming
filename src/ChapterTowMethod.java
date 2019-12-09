import java.util.Scanner;
public class ChapterTowMethod {
    public ChapterTowMethod() {
        System.out.println("Chapter 2 ::-");
    }

    /**
     * Listing 2.1 ComputeArea
     */
    public void computeArea() {
        double radius; // Declare radius
        double area; // Declare area
        // Assign a radius

        radius = 20; // radius is now 20

        // Compute area
        area = radius * radius * 3.14159;
        // Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }

    /**
     * Listing 2.2 Compute Area With Console Input
     */
    public void  ComputeAreaWithConsoleInput (){

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius

        System.out.println("Enter a numper for radius : ");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * 3.14159;

        //Desplay resulte

        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }

}