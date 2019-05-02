package com.pennant;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdharValidation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			try {
				System.out.println("Enter adhar number");
				String ano =(s.next());
				Pattern compile = Pattern.compile("[0-9]{4}\\p{Punct}[0-9]{4}\\p{Punct}[0-9]{4}");
				Matcher matcher = compile.matcher(ano);
				boolean matches = matcher.matches();
				if(matches){
					
					System.out.println("Adhar number is valid");
					flag=false;
				}
				
				else{
					System.out.println("Adhar number is invalid, please enter a valid adhar number in 0000-0000-0000 format");
				}
				//flag=false;
			} catch (Exception e) {
				System.out.println("Adhar number is invalid, please enter a valid adhar number in 0000-0000-0000 format");
			}
		}

	}

}
