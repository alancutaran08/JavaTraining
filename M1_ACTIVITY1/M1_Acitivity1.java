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
	System.out.println("What is your name?");

	String name = input.nextLine();
	System.out.println("Hello, "+name+"!");

	}

}

