package com.dur;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class j {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,10,6,7,6,98,98);
		Set<Integer> set = new HashSet();
		myList.stream()
		      .filter(n -> !set.add(n))
		      .forEach(System.out::println);
	}

}
