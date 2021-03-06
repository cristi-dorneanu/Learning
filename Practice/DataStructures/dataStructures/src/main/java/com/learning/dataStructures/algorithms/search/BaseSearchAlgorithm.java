package com.learning.dataStructures.algorithms.search;

public interface BaseSearchAlgorithm<T> {
	public int search(T[] input, T target, int low, int high);
	public default void print(T[] input)
	{
		for(T element : input)
		{
			System.out.print(element + " ");
		}
		
		System.out.println("");
	}
}
