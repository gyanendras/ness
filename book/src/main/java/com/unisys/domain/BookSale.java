package com.unisys.domain;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class BookSale {
	 public static int nthLowestSelling(int[] sales, int n) {
	        HashMap<Integer, Integer> m = new HashMap<>();
	        for(int i=0; i<sales.length; ++i){
	            if(m.containsKey(sales[i])) {
	            	m.put(sales[i], m.get(sales[i])+1);
	            }else {
	            	m.put(sales[i], 1);
	            }
	        }
	        Set<Entry<Integer, Integer>> ent = m.entrySet();
	        Comparator<Entry<Integer, Integer>> c = new Comparator<>() {

				@Override
				public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
					// TODO Auto-generated method stub
					return o1.getValue()-o2.getValue();
				}
	        	
	        };
	        TreeSet<Entry<Integer, Integer>> ts = new TreeSet<>(c);
	        ts.addAll(ent);
	        int x =0, y=0;
	        int count =0;
	        
	        Iterator<Entry<Integer, Integer>> it = ts.iterator();
	        while(it.hasNext())	{
	        	++count;
	        	Entry<Integer, Integer> ent1= it.next();
	        	x= ent1.getValue();
	        	y = ent1.getKey();
	        	if(count==n) break;
	        }
	        	
	        
			return y ;
	    }

	    public static void main(String[] args) {
	        int x = nthLowestSelling(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5 }, 2);
	        System.out.println(x);
	    }

}
