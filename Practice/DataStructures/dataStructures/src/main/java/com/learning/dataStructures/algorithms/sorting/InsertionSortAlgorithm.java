package com.learning.dataStructures.algorithms.sorting;

public class InsertionSortAlgorithm<T extends Comparable> implements BaseSortingAlgorithm<T>{

	public T[] sort(T[] input) {
		T current;
		int j = 0;
		
		for(int i = 1; i < input.length; i++)
		{
			current = input[i];
			j = i;
			
			while(j > 0 && input[j - 1].compareTo(current) > 0)
			{
				input[j] = input[j - 1];
				j--;
			}
			
			input[j] = current;
		}
		
		return input;
	}
	
	public static void main(String[] args)
	{
		Double[] input = {6.2, 3.3, 0.1, -9.0, 1002.0};
		BaseSortingAlgorithm<Double> alg = new InsertionSortAlgorithm<>();
		
		alg.print(alg.sort(input));
	}
}
