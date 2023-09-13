package com.javaExSet6;

public class CheckIfAnArrayIsSortedOrNot {
	
	    /**
	     * This method checks if the input array is sorted in ascending order.
	     * 
	     * @param array the array to check
	     * @return true if the array is sorted, false otherwise
	     */
	
	public static void main(String[] args) {
		CheckIfAnArrayIsSortedOrNot sortedArray =new CheckIfAnArrayIsSortedOrNot();
		//int [] array = {6,3,5,2,7,8};
		int [] array = {2,4,6,8,10};
		boolean result = sortedArray.isSorted(array);
		System.out.println("The given Array is in sorted form or not? : " + result);
	}
	    public boolean isSorted(int[] array) {
	          if(array.length<=1){
	              return true;
	          }
	          
	          for(int i=1;i<array.length;i++){
	           if(array[i]<array[i-1]){
	              return false;
	          }
	        
	        // TODO: Write code here
	    }
			return true;
	   }
	}

