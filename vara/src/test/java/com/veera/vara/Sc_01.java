package com.veera.vara;

public class Sc_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "veera M babu,vara M babu";
		
		
		String[] names = s.split(",");
		
		for (String name : names) {

		    String[] words = name.split("M");


		    System.out.println(words[0].trim() + " " + words[1].trim());
		
		

	}

	}
	
}

