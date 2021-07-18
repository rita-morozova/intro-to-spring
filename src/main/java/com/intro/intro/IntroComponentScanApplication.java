package com.intro.intro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.intro.intro.scope.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.intro.intro.scope.componentscan")
public class IntroComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(IntroComponentScanApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(IntroComponentScanApplication.class,
				args);

		// get bean from ApplicationContext
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);

	}

}
