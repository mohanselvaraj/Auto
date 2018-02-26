package com.practise.programs;

class ReverseString {
	
	public static void main(String[] args){

String name = "nahomlika";
int l = name.length();
String rev = "";
for(int i=l-1;i>=0;i--){
	rev = rev + name.charAt(i);
	}
System.out.println(rev);

}
}