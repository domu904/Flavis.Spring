package com.fly.flavis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FlavisApplicationTests {

	@Autowired
	private FlavisApplication controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
