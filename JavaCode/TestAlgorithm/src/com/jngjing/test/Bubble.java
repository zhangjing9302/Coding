package com.jngjing.test;

import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr=new int[] {2,10,34,1,87,39,15,7};
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入整数字符，并以；结束");
	
		int[] array=new int[5] ;
		for(int m=0;m<5;m++) {
			array[m]=sc.nextInt();
		}

		Bubble test=new Bubble();
		test.BubbleSort(array);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		
	}
	
	public void insertNum() {
		
	}
	
	public int[] BubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-1-i;j++) {
				if (arr[j]>arr[j+1] ) {
					int temp= arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		return arr;
		
	}


}
