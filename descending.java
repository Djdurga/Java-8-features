package com.dur;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = Arrays.asList(10,15, 8,98,1);
		myList.stream()
		       .sorted(Collections.reverseOrder())
		       .forEach(System.out::println);

	}

}
