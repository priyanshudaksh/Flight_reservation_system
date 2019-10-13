package com.example.pojo;

import java.util.Arrays;
import java.util.Collections;

public class Test {
	public int seat(int radix) {
	    Integer[] arr = new Integer[100];
	    for (int i = 1; i < arr.length; i++) {
	        arr[i] = i;
	    }
	    Collections.shuffle(Arrays.asList(arr));
		return arr[5];
	}
}
