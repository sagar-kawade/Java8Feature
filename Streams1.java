package com.Feature8.in;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams1 {
public static void main(String[] args) {
	List<Integer> l1=new ArrayList<>();
	for (int i = 0; i <100; i++) {
		l1.add(i);	
	}
	Stream<Integer> mystream = l1.stream().filter(x->x>90).filter(d->d%2==0);
	mystream.forEach(l->System.out.println(l));
	
	System.out.println();

	Stream<Integer> pstream = l1.parallelStream().filter(x->x>90);
	pstream.forEach(l->System.out.println(l));

}
	
	
}
