// chettraj
// chettraj
/*
 * First and Last Names
 */

import java.awt.Rectangle;

public class Homework2 {
	private String s;
	public Homework2(String q){
		q = s;
		/* Your assignment should be the other way
		 * You are assigning the value of q to s;
		 * your code currently assigns s to q
		 */
	}

	public String uppercase(){
		/* This method should operate on the string
		 * you have saved, which is s, not a
		 * new string you create
		 */
		String hob = "hello";
			String blob = hob.toUpperCase();
			return blob;

		}
		public String strip(String loop){
			/* This should call the replace method
			 * several times, first replacing all
			 * of the spaces, then the periods, etc.
			 * Each time, you need to save the result,
			 * and then return the final result
			 */
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
			/* This should calculate the perimeter of the
			 * Rectangle that is passed in (rect) by
			 * calling the getWidth and getHeight methods
			 */
			Rectangle oop = new Rectangle(10, 4, 5, 6);
			double arf = 10*2 + 4*2;
			return arf;


		}
}
