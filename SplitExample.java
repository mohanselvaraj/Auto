package com.practise.programs;

public class SplitExample{  
public static void main(String args[]){  
String s1="welcome to split world";  
System.out.println("returning words 0000:");  
for(String w:s1.split("\\s")){  
System.out.println(w);  
}  
System.out.println("returning words 11111:");  
for(String w:s1.split("\\s",1)){  
System.out.println(w);  
}  
System.out.println("returning words 22222 :");  
for(String w:s1.split("\\s",2)){  
System.out.println(w);  
}  
String s2="almapaba";
for(String w:s2.split("a")){  
System.out.println(w);  
} 

}}  