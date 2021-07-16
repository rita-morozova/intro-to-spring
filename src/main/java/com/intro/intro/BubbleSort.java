package com.intro.intro;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgorithm {
	@Override
	public int[] sort(int[] numbers) {
		// Logic for Bubble Sort
		return numbers;
	}

}
