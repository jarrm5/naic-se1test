/*
 * Copyright 2017. National Association of Insurance Commissioners.
 */

package org.naic.se1test;

public class MCP {
	//private String test = "test";
	private static String test = "test";

	public static void main(String[] args) {

		// The phrase "You have no args" should display on the console
		//if (args.length > 0){
		if (args.length == 0){
			System.out.println("You have no args");
		}

		// The phrase "they are equal" should display on the console
		//if (test = "test"){
		if (test.equals("test")){
			System.out.println("they are equal");
		}

		// 0 through 9 should display on the console
		for (int i = 0; i<10; i++){
			//break;
			System.out.println(i);
		}
	}
}
