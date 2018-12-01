package com.kapil.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoAppTest {

	DemoApp obj = new DemoApp();
	
	@Test
	void test() {
		assertEquals(0, obj.calculate());
	}

}
