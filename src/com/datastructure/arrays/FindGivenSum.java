package com.datastructure.arrays;

import java.util.Scanner;

/**
 * Subarray with given sum
 **/
public class FindGivenSum {
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		int tests = sn.nextInt();
		for(int i=0;i<tests;i++) {
			int size=sn.nextInt();
			int sum=sn.nextInt();
			int arr[]=new int[size];
			for(int j=0;j<size;j++) {
				arr[j]=sn.nextInt();
			}
			findSum(arr, size, sum);
		}

	}
	private static void findSum(int []arr,int size,int sum) {
		int i=0;
		int j=0;
		int s=0;
		for(;i<size;i++) {
			int t=arr[i];
			if(t==sum) {
				s=t;
				break;
			}
			for( j=i+1;j<size;j++) {
				t+=arr[j];
				if(t==sum) {
					s=t;
					break;
				}
				else if (t>sum) {
					break;
				}
			}
			if(s!=0) {
				break;
			}
		}
		System.out.println(s==0?-1:i+1+" "+(j+1));
	}
}
