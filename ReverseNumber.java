package com.practise.programs;



class ReverseaNumber {
	
	public static void main(String[] args){

int num = 452;
int reversenum = 0;

while(num !=0){
	reversenum = reversenum*10;
	reversenum = reversenum+num%10;
	num=num/10;
	
}
System.out.println(reversenum);
}
}