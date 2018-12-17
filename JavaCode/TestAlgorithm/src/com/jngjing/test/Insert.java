package com.jngjing.test;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insert insert=new Insert();
		int[] array=new int[] {2,10,34,1,87,39,15,7};
		insert.insertSort(array);
		for(int m=0;m<array.length;m++) {
			System.out.println(array[m]);
		}
		

	}
	public int[] insertSort(int [] array) {
		for(int i=1;i<array.length;i++) {
			for(int j=i;j>0;j--) {
				if(array[j]<array[j-1]) {
					int temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}	
			}
		}
		return array;
		
	}

}
