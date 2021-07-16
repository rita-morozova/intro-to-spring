package com.intro.intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

	@Autowired // make it dependency
	private SortAlgorithm sortAlgorithm;

	// Use can use either constructor injection or setter injection; if it's
	// mandatory - use constructor injection; with @Autowired we don't need either
	// one

	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// If Bubble sort implemented here - this binary Search tightly coupled to the
		// Bubble Sort

		return 3;
	}
}
