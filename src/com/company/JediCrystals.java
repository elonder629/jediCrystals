package com.company;

import java.util.Scanner;


public class JediCrystals {

	private static int achieveBalance(Scanner sc) {
		//System.out.println("This runs!");
		/* Insert your code in here.
		 *
		 * Your code should use sc.nextLine() to read the input line by line; each line 
		 * contains a 'R', 'G', or 'B' to indicate which crystal has been found. 
		 * Your code should return when the next balance is achieved, i.e., return when 
		 * you have seen an equal number of red, green, and blue crystals.
		 *
		 * Note that your code will not read all the input from the beginning in a single call, 
		 * but rather will continue where the previous call to the function stopped.
		 *
		 */

		/* End */
        //System.out.println("honk");

        //System.out.println(temp);
        int r = 0,b = 0,g = 0;

		do {
			String nextLine = sc.nextLine();
			if (nextLine.equals("R")){
				r++;
			}

			else if (nextLine.equals("B")){
				b++;
			}
			else {
				g++;
			}

		} while ( r!=g || g!=b || b!=r);

		return r;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numOfTestCases = sc.nextInt();
		sc.nextLine();

		for (int testCase=0; testCase < numOfTestCases; testCase++) { 
			int answer = achieveBalance(sc);
			System.out.println("Balance achieved at " + answer);
		}

		sc.close();
	}
}

