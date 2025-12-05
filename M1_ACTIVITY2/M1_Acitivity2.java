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

	System.out.println("Enter your age:");
	
	String age = input.nextLine();
	
	int ageInt = Integer.parseInt(age);
	System.out.println("Your age as int: "+ageInt);
	
	double ageDouble = Double.parseDouble(age);
	System.out.println("Your age as double: "+ageDouble);
	
	}

}

