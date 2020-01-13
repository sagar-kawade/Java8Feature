package com.Feature8.in;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SplitItorator1 {
	
	public static void main(String[] args) {
		List<Integer>l1=new ArrayList();
		for (int i = 1; i <=10; i++) {
			l1.add(i);
		}
		
		Spliterator<Integer>spit =l1.spliterator();
		spit.forEachRemaining(System.out::println);

	/*	do{
			System.out.println(spitr);
		}
			while (spitr.tryAdvance(i->i++)); 
	*/
		Stream<Integer> str=l1.stream();
		Spliterator<Integer>spitr =str.spliterator();

		System.out.println(spitr.characteristics());
		
		System.out.println(spitr.getExactSizeIfKnown());
		System.out.println(spitr.estimateSize());
		Spliterator<Integer>spitr2=spitr.trySplit();
		spitr2.forEachRemaining((s)->System.out.println(s));
		
		
		
		
		}

}
