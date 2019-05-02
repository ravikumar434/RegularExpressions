package com.pennant;

import java.util.Scanner;

public class ControlBackDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		

		while (flag) {
			try {
				
				System.out.println("Input a Number: ");
				int x = Integer.parseInt(sc.nextLine());
				System.out.println("Number is " + x);
				flag = false;

			} catch (Exception e) {
				System.out.println("Only numbers should be provided...");
			
			}
		} // while loop end

	}

}
