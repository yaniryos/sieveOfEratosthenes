package sieveOfEratosthenes;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;

public class AlgoManager {

	protected static int numberLimit;
	protected static int[] allNumbersUpToLimit;
	
	public AlgoManager(){
		
		super();
	}

	public void execute() {
		
		getUserInput();
		initArray();
		findPrimes();
		printPrimes();
	}
	
	private static void getUserInput() {
		
		System.out.println("Enter a number limit:");
		
		try {
			numberLimit = Integer.parseInt(MyReader.reader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void initArray() {
		
		//Populate array with the numbers 0 up to 'numberLimit'.
		allNumbersUpToLimit = IntStream.rangeClosed(0, numberLimit+1).toArray();
	}

	private static void findPrimes() {
		
		/*
		 * For each number i (s.t i > 1) in the array, scan through all remaining numbers
		 * (starting at i^2) and change it's multiples to 0.
		 */
		Arrays.stream(allNumbersUpToLimit).forEach(i -> {Arrays.stream(allNumbersUpToLimit)
			.forEach(j -> {if(i>1 && j>=Math.pow(i, 2) && j%i==0) allNumbersUpToLimit[j]=0;});});
	}
	
	private static void printPrimes() {
		
		/*
		 * Each non-zero number is the array is a definite prime (except for 1).
		 * Therefore print all numbers that are greater than 1.
		 */
		Arrays.stream(allNumbersUpToLimit).forEach(i -> {if(i>1) System.out.println(i);});
	}
}
