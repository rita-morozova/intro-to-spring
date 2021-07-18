package com.intro.intro.spring.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
// we can use either @Primary or @Qualifier("bubble")
public class BubbleSort implements SortAlgorithm {
	@Override
	public int[] sort(int[] numbers) {
		// Logic for Bubble Sort
		return numbers;
	}

}
