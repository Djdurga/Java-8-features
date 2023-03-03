package com.dur;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class firstElement {
	public static void main(String[] args) {
		//int count;
		List<Integer> myList = Arrays.asList(10,25,63,56);
//		myList.stream();
//		       .filter(n -> n%2 == 0)
//		       .collectors(n)
//		       .ifPresent(System.out::Println);
		
//		List<Integer> mylist1 =myList.stream().filter(n->n%2==0).collect(Collectors.toList());
//		System.out.println(mylist1);
		 
		 long count= myList.stream().count();
		 System.out.println(count);
		 
		 
		
	
	}

}
