/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter distance to the target.\n");
		double d = reader.nextDouble();
		System.out.println("\nEnter height of battery relative to the water line.\n");
		double h = reader.nextDouble();
		System.out.println("\nEnter the initial velocity of the shell.\n");
		double v = reader.nextDouble();
		
		double a = -4.9*(d/v)*(d/v);
		double b = d;
		double c = h + a;
		
		double tanTheta = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
		double angle = Math.atan(tanTheta)*180/3.14159;
		System.out.println("\nSet the angle to: " + angle + " degrees.\n");
		
	}
}
