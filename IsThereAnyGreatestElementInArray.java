package com.javaExSet6;

public class IsThereAnyGreatestElementInArray {
	
	    
	    /**
	     * This method determines whether there's an element greater than a given number in an array.
	     *
	     * @param array The array to search through.
	     * @param number The number to compare with the array elements.
	     * @return True if there's an element greater than the given number in the array, false otherwise.
	     */
		 
	public static void main(String [] args) {
		IsThereAnyGreatestElementInArray greatestElement = new IsThereAnyGreatestElementInArray();
		int [] array = {4,5,6,2,8,9,3,1}; 
		boolean result = greatestElement.doesHaveElementGreaterThan(array, 6);
		System.out.println("The given array has greatest element when compared with given number? : "+ result);
	}
	
		public boolean doesHaveElementGreaterThan(int[] array, int number) {

	        // TODO: Write your code
	        if(array.length==0){
	            return false;
	        }
	        for (int element : array){
	            if(element>number){
	                return true;
	            }
	        }
	            return false;
	        
	        
	    }
	}

