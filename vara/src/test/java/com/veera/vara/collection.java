package com.veera.vara;

import java.util.ArrayList;

import java.util.List;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l1=new ArrayList ();
		
		List<String>l2=new ArrayList<String>();
		
		l1.add("veera");
		
		l1.add("vara");
		
		l1.add("phani");
		
		l1.add("gowtham");
		
		l1.add("veera");
		
		l1.add("gowtham");
		
		for(int i=0;i<=l1.size()-1;i++) {
			
			
		    boolean duplicate = false;
			
			for(int j=0;j<=l2.size()-1;j++) {
				
				
				if(l1.get(i).equals(l2.get(j))) {
					
					duplicate=true;
					
					break;
					
					
				}
				
				
				
			}
			
			
			if(!duplicate) {
				
				
				l2.add(l1.get(i));
			}
			
			
		}
		
		
		System.out.println(l2);
		

	}

}
