package sieveOfEratosthenes;

public class Main {

	/*
	 * This is an implementation of the "Sieve of Eratosthenes" algorithm.
	 * The purpose of this algorithm is find all primes up to a user given
	 * limit. "... It does so by iteratively marking as composite (i.e., not prime) 
	 * the multiples of each prime, starting with the first prime number, 2.
	 * The multiples of a given prime are generated as a sequence of numbers 
	 * starting from that prime, with constant difference between them that
	 *  is equal to that prime ..."
	 */
	
	public static void main(String[] args){
		
		AlgoManager myAlgo = new AlgoManager();
		myAlgo.execute();
	}
}
