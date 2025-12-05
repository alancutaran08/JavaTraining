/**
* 
 */
package ph.com.bpi.hello;

import java.util.Scanner;
/**
* 
 */
public class HelloMain {

	/**
	* @param args
	*/
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//System.out.println("Hello World");
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter first integer:");
	Integer a = input.nextInt();
									
	System.out.println("Enter second integer:");
	Integer b = input.nextInt();
	
	int sum = a+b;
	System.out.println("Sum: "+sum);
	
	int difference = a-b;
	System.out.println("Difference: "+difference);
	
	int product = a*b;
	System.out.println("Product: "+product);
	}

}

