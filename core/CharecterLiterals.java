package com.wheremagichappens.core;

public class CharecterLiterals {
	public static void main(String[] args) {
		char ch1 = 'A';
		// char ch2 = ''; single space is not a charecter
		// char ch3 = 'AB'; Only one single charecter is allowed.
		char ch4 = '*';
		char ch5 = '7';
		System.out.println(ch1);
		System.out.println(ch4);
		System.out.println(ch5);

		char ch6 = ' '; // one space
		// char ch7 = ' ';//Tab key
		// char ch8 = ' '; //Multiple spaces
		char ch10 = '\'';
		// char ch11 = '\p'; Not a charecter
		char ch12 = '\u0045';
		System.out.println(ch12);

		char ch13 = '\u00cf';
		System.out.println(ch13);

		char ch14 = 1;
		char ch15 = 65;
		System.out.println(ch15);
		char ch16 = 198;
		System.out.println(ch16);
		char ch17 = 65535;
		System.out.println(ch17);
		System.out.println("\n---------");
		
		for (char i = 0; i <= 255; i++) {
			int x = i;
			System.out.println(x);
			System.out.println("\t");
			System.out.println(i);
			System.out.println();
		}

	}
}
