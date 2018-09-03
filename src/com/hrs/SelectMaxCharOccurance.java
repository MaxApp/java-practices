package com.hrs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SelectMaxCharOccurance {

	private static final String str = "bjhkdieruytAWslqBhKigzcPhZXCVqpWgsWEaRElsdfSUUWiuyiRkhdgahsWsERdHKfUKULhasdhgasldjfad";
	
	
//	private static class MyComparator implements Comparator<Map.Entry<Integer, Integer>>{
//
//		@Override
//		public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//			return o1.getValue().compareTo(o2.getValue());
//		}
//		
//	}
	
	
	
	public static void main(String[] args) {
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			Integer v = hmap.getOrDefault(c, 0);
			hmap.put(c, ++v);
		}
		
		ArrayList<Character> list = new ArrayList<Character>();
		ArrayList<Integer> sortlist = new ArrayList<Integer>(hmap.values());
		//Collections.sort(sortlist);
		int max = Collections.max(sortlist);
//		System.out.println(max);
		
		for(Map.Entry<Character, Integer> entry : hmap.entrySet()){
			System.out.println(entry.getKey()+" - "+entry.getValue());
			if(entry.getValue() == max){
				list.add(entry.getKey());
			}
		}
//		int i=4;
//		
//		tmap.put(7, i++);  //4
//		tmap.put(5, i++);  //5
//		tmap.put(6, i++);
//		
//		Iterator<Entry<Integer, Integer>> it = tmap.entrySet().iterator();
//		while(it.hasNext()){
//			Entry<Integer, Integer> entry = it.next();
//			System.out.println(entry.getKey()+" - "+entry.getValue());
//		}
		
//		 Set<Map.Entry<Integer,Integer>> entrySet = tmap.entrySet();
//		 ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(entrySet);
//		 Collections.sort(list, new MyComparator());
//		 
		for(char c:list){
			System.out.print(c+" ");
		}
		System.out.println();
		
		int[] charseq = new int[list.size()];
		
		/*
		 *  [ d h s ] = charArray[]
		 *  [ 4 2 13 ] = charseq[]
		 */
		Object[] charArray = list.toArray();
		
		
		for (int k=0; k<list.size(); k++) {
			charseq[k] = str.indexOf(list.get(k));
		}
		
		System.out.println("---------------------------");
		charseqMin(charseq, charArray);
		
		for(int i:charseq){
			System.out.print(i+" ");
		}
		System.out.println();
		for(Object j:charArray){
			System.out.print(j+" ");
		}
		
	}
	
	private static void charseqMin(int[] charseq, Object[] charAray){
		
		for(int i=0; i<charseq.length; i++){
			int tmpIdx = i;
			int value = charseq[i];
			for(int j=i+1; j<charseq.length; j++){
				if(charseq[j]<value){
					value = charseq[j];
					tmpIdx = j;
				}
			}
			if(tmpIdx != i){
				int tmp = charseq[i];
				charseq[i] = value;
				charseq[tmpIdx] = tmp;
				
				Object tmp2 = charAray[i];
				charAray[i] = charAray[tmpIdx];
				charAray[tmpIdx] = tmp2;
			}
		}
	}
	
	

}
