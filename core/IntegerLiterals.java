package com.wheremagichappens.core;

public class IntegerLiterals {
 public static void main(String[] args) {
	int ab = 2147483647;
	System.out.println("Max limit of primitive int:\t" + ab);
	
	//int bc = 2147483648; Out of Range for primitive integer.
	//long val  = 2147483648; Out of range for integer.
	
	long val  = 2147483648L;
	
	//System.out.println(2147483648);
	System.out.println(2147483648L);
	System.out.println(val);
	
}
}
