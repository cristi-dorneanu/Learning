package com.learning.dataStructures.algorithms.others;

import java.io.File;

public class TotalDiskUsage {
	
	public static long diskUsage(File root)
	{
		long total = root.length();
		
		if(root.isDirectory())
		{
			for(String childName : root.list())
			{
				File child = new File(root, childName);
			
				total += diskUsage(child);
			}
		}
		
		System.out.println(total + "\t" + root);
		return total;
	}
	
	public static void main(String[] args)
	{
		File root = new File("/home/dorni");
		System.out.println("Usage " + root.getAbsolutePath() + " : " + diskUsage(root));
	}
}
