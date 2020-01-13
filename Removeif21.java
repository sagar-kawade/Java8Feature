package com.Feature8.in;

import java.util.ArrayList;
import java.util.List;

public class Removeif21 {
	
	public static void main(String[] args) {
		List<Integer>l2=new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			l2.add(i);
			
		}
		System.out.println(l2);
		l2.removeIf(l->l%2==0);
		System.out.println(l2);
	}

}
