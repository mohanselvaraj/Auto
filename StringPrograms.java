package com.practise.programs;

public class StringPrograms {

	public static void main(String [] args){
		  String sPopularTopic_1 = "Selenium Automation Framework";
		  String sPopularTopic_2 = "Basic Java Tutorial";
		  String sPopularTopic_3 = "Basic Java Tutorial";
		  System.out.println(" sPopularTopic_1 and 2 value " + sPopularTopic_1.equals(sPopularTopic_2));

		  System.out.println(" sPopularTopic_2 and 3 equals check " + sPopularTopic_2.equals(sPopularTopic_3));
		  System.out.println(" sPopularTopic_2 and 3 character " + (sPopularTopic_3.charAt(5)));
		  System.out.println(" sPopularTopic_2 and 3 indexcheck " + (sPopularTopic_3.indexOf("i")));
		  System.out.println(" sPopularTopic_2 and 3 substring start " + (sPopularTopic_3.substring(2)));
		  System.out.println(" sPopularTopic_2 and 3 substring start and end " + (sPopularTopic_3.substring(2, 4)));
		  System.out.println(" sPopularTopic_2 and 3 contains " + (sPopularTopic_3.contains("va")));
		  System.out.println(" sPopularTopic_2 and 3 substring start and end " + (sPopularTopic_3.substring(0,4)));
		 String [] aSplit = sPopularTopic_1.split("Automation");
		 //for(String bSplit = aSplit)
			 for(String a:aSplit){
					System.out.println("Prnt values of auto split: " + a );
				}
		  
	}
}
