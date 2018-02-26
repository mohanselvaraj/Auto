package com.practise.programs;

public class SortingQuickly {
    private int [] arraySort;
	 public void SortMethod(int [] intArray){
		 int len = intArray.length;
		 this.arraySort = intArray;
		 quickSort(0,len-1);
		 
	 }
	 public void quickSort(int StartingIndex, int EndingIndex){
		 int i = StartingIndex;
		 int j = EndingIndex;
		 while(i<=j){
			int MiddleIndex = arraySort[StartingIndex + (EndingIndex-StartingIndex)/2];
		 
		 while( arraySort[i] < MiddleIndex)
			 i++;
		 while( arraySort[j] > MiddleIndex)
			 j--;
		 if(i<=j){
		 swapnumbers(i,j);
			 i++;
			 j--;
			 } }
			 if( StartingIndex <  j){
				 quickSort(StartingIndex,j);
			 }
		    if(  i < EndingIndex){
		    	quickSort(i,EndingIndex);
		    }
			 
	
		
			 
		 }
	 
	public void swapnumbers(int i, int j) {
		// TODO Auto-generated method stub
		int temp = arraySort[i];
		arraySort[i] = arraySort[j];
		arraySort[j] = temp;
		
		
	}
	public static void main(String [] args){
		int [] intArray = {24,2,45,20,56,75,2,56,99,53,12};
		SortingQuickly sortArray = new SortingQuickly();
		sortArray.SortMethod(intArray);
		
		for(int i :intArray){
			System.out.println(i);
		}
	}
}
