package com.hrs;

public class HelloGithub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello github");
		
		int[] a  = {72,3,4,2,31,14,24,9,5};
		sort(a);
	}
	
	
	private static void sort(int[] array){
		
		for(int i=0; i<array.length; i++){
			int minV = array[i];
			int minIdx = i;
			for(int j=i+1; j<array.length; j++){
				if(array[j] < minV){
					minV = array[j];
					minIdx = j;
				}
			}
			if(minIdx != i){
				int tmp = array[i];
				array[i] = array[minIdx];
				array[minIdx] = tmp;
			}
		}
		
		for(int k : array){
			System.out.print(k+" ");
		}
	}

}
