package com.hackerRank.programs.in;

import java.util.Scanner;

public class Java_SubArray {
	public static void main(String args[]) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int sum = 0;
				for(int k=i;k<=j;k++)
				{
					sum+=a[k];
				}
				if(sum<0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
