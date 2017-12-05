package com.wheremagichappens.core;
/*
 *Everything about string literals and how they behave. 
 * **/
public class StringLiterals {
	public static void main(String[] args) {
		String st1 = "";
		String st2 = "A";
		String st3 = "NASDFGsafh#$%^&345jkls";

		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
		String st4 = "N65M\u00cfTR";
		System.out.println(st4);
		
		String st5 = "N65M\\u00cfTR";
		System.out.println(st5);
		
		String st8 = "HELLO\rKA";
		System.out.println(st8);
		
		System.out.println("\u00cf");
		
		
	}
}
