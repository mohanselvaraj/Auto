package com.practise.programs;

public class RecurReverse {
	public String revMethod(String name){
		if ((name == null) || (name.length() <=1))
			return name;
		return revMethod(name.substring(1)) +name.charAt(0);

	}

	public Integer revNumber(int num){
		int reversenum = 0;
		while(num !=0)
			reversenum = reversenum*10;
		reversenum = reversenum+num%10;
		num=num/10;
		return num;
	}

	public static void main (String [] args){
		RecurReverse recurObj = new RecurReverse();
		String name = "nahomlika";
		//System.out.println("Reverse a String :" + recurObj.revMethod(name));
		int num = 123456789;
		System.out.println("Reverse a Number :" + recurObj.revNumber(num));
	}
}
