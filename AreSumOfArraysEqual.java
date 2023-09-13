package com.javaExSet6;

public class AreSumOfArraysEqual {
	

	    private int[] array1;
	    private int[] array2;

	    public AreSumOfArraysEqual(int[] array1, int[] array2) {
	        this.array1 = array1;
	        this.array2 = array2;
	    }
   public static void main(String[] args) {
	   int [] array1 = {2,3,4,5,6,7};
	   int [] array2 = {7,6,5,4,3,5};
	   AreSumOfArraysEqual sumOfArraysEqual = new AreSumOfArraysEqual( array1 , array2);
	   boolean result = sumOfArraysEqual.areSumsEqual();
	   System.out.println("The Sum Of Elements In a Array are equal or not : " + result);
	   
}
	    public boolean areSumsEqual() {

	        int sum1 = calculateSum(array1);
	        int sum2 = calculateSum(array2);
	         if(sum1 == sum2){
	             return true;
	         }
	         else {
	             return false;
	         }
	        // TODO: Write the code to compare the sums of the arrays and return the result.
	    }

	    private int calculateSum(int[] array) {
	        int sum=0;
	        // TODO: Write the code to calculate the sum of the array.
	          for(int element : array){
	              sum = sum +element;
	          }
	          return sum;
	    }
	}
	
