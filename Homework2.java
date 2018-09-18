/*
 * First and Last Names
 */

import java.awt.Rectangle;

public class Homework2 {
	private String s;
	public Homework2(String q){
		q = s;
	}

	public String uppercase(){
		String hob = "hello";
			String blob = hob.toUpperCase();
			return blob;

		}
		public String strip(String loop){
			String s1 = "Hi! I love pineapples, trees, and hugs.";
			String s2 = s1.replace("Hi! I love pineapples, trees, and hugs", "HiIlovepineapplestreesandhugs");
			return s2;

		}



	/* Write the constructor for Homework2.
	 * It takes in one parameter: a String
	 * Save the string as a private instance variable
	 */


	/* Write the method upperase
	 * It does not take in any parameters
	 * It returns a String
	 * Use String methods to turn the instance variable String into all
	 * uppercase letters and return the result
	 * Hint: Search the String class for 'uppercase'
	 */


	/* Write the method strip
	 * It takes in one paramter: a String
	 * It returns a String
	 * Use String methods to remove punctuation from the parameter String
	 * It should remove spaces, commas, periods, and exclamation points.
	 * Hint: Search the String class for 'replace'
	 */


	/* Fix the errors in the method problem4
	 */
	public Rectangle problems() {
		Rectangle r1 = new Rectangle(5, 10, 15, 20);
		double width = r1.getWidth();
		Rectangle r2 = new Rectangle(10, 40, 8, 10);
		r2.translate(15, 25);
		Rectangle r3 = new Rectangle(6, 7, 8, 9);
		r3.translate(1000000000, 1000000000);

		return r3;
	}



	/* Use Rectangle methods to calculate and return the perimeter of the
	 * parameter Rectangle
	 */
	 	public double getPerimeter(Rectangle rect){
			Rectangle oop = new Rectangle(10, 4, 5, 6);
			double arf = 10*2 + 4*2;
			return arf;


		}
}
