package com.intro.intro.spring.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired // make it dependent on SortAlgorithm
	// sortAlgorithm is a dependency of BinarySearch

	// @Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;

	// We can use either constructor injection or setter injection; if it's
	// mandatory - use constructor injection;
	// with @Autowired we don't need either one

	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortedNumbers);

		// If Bubble sort was implemented here - this binary Search would be tightly
		// coupled to Bubble Sort

		return 3;
	}

	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}

	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}
}
