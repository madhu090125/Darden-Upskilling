package com.logical.coding.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayDemo {

	int[] arr = { 1,4,2,6,8,4,4,8,0,3 };

	public void sortArray() {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			int temp=0;
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}	
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("\nMaximum number in the array is: "+max);
		
		int min =  arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum number in the array is: "+min);
		
		
		int arr2 = arr[arr.length - 2];
		System.out.println("Second largest number in array is: "+arr2);
	}
	
	public void sumOfSmallestConsecutive() {
		int a=arr[0],b=arr[1],c=0;
		
		int [] newArray = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(a);
			newArray[i] =a;
		}
		System.out.println();
		int val = newArray[0];
		for(int i=0;i<newArray.length;i++) {
			System.out.print(newArray[i]+" ");
			if(newArray[i]<val) {
				val = newArray[i];
			}
		}
		System.out.println("\n****************\n"+val);
	}
	
	public void checkForDuplicates() {
		int count=0;
//		IntStream stream = (IntStream) Arrays.asList(arr);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]==arr[j] && i != j) {
					System.out.println("Yes duplicated there" +arr[i]+" count "+count);
					break;
				}	
			}
		}
//		System.out.println(count);
	}

}
