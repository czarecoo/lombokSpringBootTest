package com.example.demo;

import com.example.demo.com.czareg.model.Base;
import com.example.demo.com.czareg.model.Specific;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void toStringCheck() {
		Base base = new Specific("model","123","333333333333");
		System.out.println(base.toString());
	}

	@Test
	void equalsCheckForExtendingClassField() {
		Specific specific1 = new Specific("model","123","333333333333");
		Specific specific2 = new Specific("model","123","666");
		assertNotEquals(specific1,specific2);
	}

	@Test
	void equalsCheckForBaseClassField() {
		Specific specific1 = new Specific("model","123","333333333333");
		Specific specific2 = new Specific("otherModel","123","333333333333");
		assertNotEquals(specific1,specific2);
	}
}
