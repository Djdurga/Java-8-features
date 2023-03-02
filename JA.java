package com.dur;

import java.util.Arrays;
import java.util.List;

public class JA {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,23,12,56,80);
		myList.stream()
		      .filter(n -> n % 2 == 0)
		      .forEach(System.out::println);
	}

}
