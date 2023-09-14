package com.javaExSet6;

import java.util.ArrayList;
import java.util.List;

public class ReturnArrayListWithMultiplesOfAGivenNumberLessThanASpecifiedLimit {

	
	
	    /**
	     * This method generates a list of multiples of a given number less than a specified limit.
	     * 
	     * @param number the number to find multiples of
	     * @param limit the upper bound for the multiples
	     * @return a List of multiples of the number less than the limit
	     */
	public static void main(String[] args) {
		ReturnArrayListWithMultiplesOfAGivenNumberLessThanASpecifiedLimit mulOfNumSL = new ReturnArrayListWithMultiplesOfAGivenNumberLessThanASpecifiedLimit();
		List<Integer>  result = mulOfNumSL.determineMultiples(2,20);
		System.out.println("The Output is : " + result );
	}
	    public List<Integer> determineMultiples(int number, int limit) {
	         List<Integer> multiples = new ArrayList<>();
	        // TODO: Write your code here
	        if(number <=0 || limit <=0){
	            return multiples;
	        }
	        
	        for(int i=1;i*number<limit;i++){
	            multiples.add(i*number);
	        }return multiples;
	        }
	}

