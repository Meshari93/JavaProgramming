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

    /**
     * Listing 2.3 Compute Average
     */

    public void ComputeAverage() {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter three number
        System.out.println("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // Compute average
        double average = (number1 + number2 + number3 ) / 3;

        //Desplay results
        System.out.println("The average of " + number1 + " " +  number2 + " " + number3 + " " + " is  " + average );

    }

    /**
     * Listing 2.4 ComputeAreaWithConstant
     */

    public  void ComputeAreaWithConstant () {
        final double PI = 3.14159;

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();

        //Compute area
        double area = radius * radius * PI;

        //Display result
        System.out.println("The area for the circle of radius " + radius + " is " + area) ;

    }

}