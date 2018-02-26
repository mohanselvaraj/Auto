package com.practise.programs;

public class SampleZeroansOne {
	public static void main(String args []){
		int intArray [] = {0,1,1,0,0,1,1,0,1,1,0};
		int len = intArray.length;
		
		arrange1and0(intArray,len);
	}
	public static  void arrange1and0(int [] intArray, int len){
		int count =0;
		//get coutn of zeros here
		for(int i=0;i<len;i++){
			if(intArray[i] ==0){
				count++;
			}
		}
		//put zeros first in array
		for(int i=0;i<count;i++){
			intArray[i] =0;
		}
		for(int i=count;i<len;i++){
			intArray[i] =1;
		}
		for(int i=0;i<len;i++){
		System.out.println(intArray[i]);	
		}
	}

}
