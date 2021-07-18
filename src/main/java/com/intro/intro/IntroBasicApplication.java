package com.intro.intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.intro.intro.spring.basic.BinarySearch;

// When building a Spring application, we have to answer three questions:
// What are the beans? (@Component)
// What are the dependencies? (@Autowired)
// Where to search for beans? (@SpringBootApplication automatically scans for beans)

@SpringBootApplication
@ComponentScan("com.intro.intro.spring.basic")
public class IntroBasicApplication {

	public static void main(String[] args) {

		// ApplicationContext stores beans; they are created automatically when
		// SpringApplication runs
		ConfigurableApplicationContext applicationContext = SpringApplication.run(IntroBasicApplication.class, args);

		// get bean from ApplicationContext
		// if we request the bean several times - we receive the same bean: Singleton -
		// one instance per Spring Context. It's a default scope
		// if we want a new bean every time, we request it - we should use Prototype
		// scope
		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
		BinarySearch binarySearch1 = applicationContext.getBean(BinarySearch.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);

		int result = binarySearch.binarySearch(new int[] { 12, 3, 4, 6 }, 5);
		System.out.println(result);
	}

}
