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
	Integer age = input.nextInt();
	
	if(age < 18) { System.out.println("Minor"); }
	else if(age >= 18 && age <= 59) { System.out.println("Adult"); }
	else { System.out.println("Senior"); }
	}

}

