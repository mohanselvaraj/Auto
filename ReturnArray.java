package com.practise.programs;

public class ReturnArray {
	public static void main (String [] args){
		String [] aReturn = returnArraryMethod();
		for(String a:aReturn){
			System.out.println("Prnt values of car : " + a );
		}
	}
	public static String [] returnArraryMethod(){
	String [] returnValue = {"iphone","Samsung","nokia","Acer"};	
     return returnValue;
	}
}


