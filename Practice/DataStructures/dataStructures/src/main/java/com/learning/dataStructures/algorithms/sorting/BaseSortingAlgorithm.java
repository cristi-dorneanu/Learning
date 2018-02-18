package com.learning.dataStructures.algorithms.sorting;

public interface BaseSortingAlgorithm<T> {
	public T[] sort(T[] input);
	public default void print(T[] input)
	{
		for(T element : input)
		{
			System.out.print(element + " ");
		}
		
		System.out.println("");
	}
}
