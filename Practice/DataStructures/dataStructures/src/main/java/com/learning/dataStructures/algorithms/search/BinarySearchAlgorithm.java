package com.learning.dataStructures.algorithms.search;

public class BinarySearchAlgorithm<T extends Comparable> implements BaseSearchAlgorithm<T>{

	@Override
	public int search(T[] input, T target, int low, int high) {
		if(low > high)
		{
			return -1;
		}
		else
		{
			int median = ((low + high) / 2);
			if(input[median].equals(target))
			{
				return median;
			}
			else if(input[median].compareTo(target) > 0)
			{
				return search(input, target, low, median - 1);
			}
			else
			{
				return search(input, target, median + 1, high);
			}
		}
	}

}
