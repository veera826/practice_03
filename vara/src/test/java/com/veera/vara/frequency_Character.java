package com.veera.vara;

import java.util.HashMap;

public class frequency_Character {
	  
	public static void main(String[] args) {
		
		   
        String s="veerababu";
        
        char[]ch=s.toCharArray();
        
    HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
        
        for(char ch1:ch){
            
            if(hm.containsKey(ch1)){
                
               hm.put(ch1,hm.get(ch1)+1) ;
                
            }else{
                
                hm.put(ch1,1);
                
                
                
            }
            
            
            
        }
        
        for(char key:hm.keySet()) {
        	
        	
        	if(hm.get(key)>=1) {
        		
        		System.out.println(key+" "+hm.get(key));
        	}
        	
        	
        	
        }
        
		
	}

	
	
  }
