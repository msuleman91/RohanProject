package com.rohan.java;

import java.util.Scanner;
public class SwitchAtoE {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		String string_len;
		
		System.out.println("Enter a character between A, B, C, D, or E");
	//	char c = userinput.next().charAt(0);
		string_len = userinput.nextLine();
		//int m=string_len.length();
		System.out.println(string_len.length());
		//System.out.println(checkinput);
		
	/*	if(string_len.length()==1) {
		switch(c) {
		
		case 'A':
			System.out.println("Apple");
			break;
		
		case 'B':
			System.out.println("Banana");
			break;
			
		case 'C':
			System.out.println("Cherries");
			break;
		
		case 'D':
			System.out.println("Dragonfruit");
			break;
		case 'E':
			System.out.println("ElderBerry");
			break;
		
		default:
			System.out.println("Not in Fruit Basket");

		}
		}
		else {
			System.out.println("Not in the Fruit Basket");
	}
		
		userinput.close();
	}
*/
}
}
