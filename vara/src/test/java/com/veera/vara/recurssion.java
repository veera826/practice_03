package com.veera.vara;

public class recurssion {
	
	
public static void m1(int x,int y) {
		
		if(x<=y) {
			
		if(x%2==0) {
			
			System.out.println(x);
			
		}
		
		m1(x+1,y);
		
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		m1(1,10);

	}

}
