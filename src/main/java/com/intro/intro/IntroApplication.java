package com.intro.intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// When building a Spring application, we have to answer three questions:
// What are the beans? (@Component)
// What are the dependencies? (@Autowired)
// Where to search for beans? (@SpringBootApplication automatically scans for beans)

@SpringBootApplication
public class IntroApplication {

	public static void main(String[] args) {

		// ApplicationContext stores beans; they are created automatically when
		// SpringApplication runs
		ConfigurableApplicationContext applicationContext = SpringApplication.run(IntroApplication.class, args);

		// get bean from ApplicationContext
		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);

		int result = binarySearch.binarySearch(new int[] { 12, 3, 4, 6 }, 5);
		System.out.println(result);
	}

}
