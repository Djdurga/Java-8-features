package com.dur;

import java.util.Arrays;
import java.util.List;

public class java {
	public static void main(String[] args) {
		List<Integer> myLis = Arrays.asList(19,12,66,156);
		myLis.stream()
		      .map(s -> s + "")
		      .filter(s -> s.startsWith("1"))
		      .forEach(System.out::println);
	}

}
