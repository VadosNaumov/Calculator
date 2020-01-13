package com.calc.SpringAppCalculator;

import com.calc.SpringAppCalculator.controller.Calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class SpringAppCalculatorApplicationTests {

	@Test
	void contextLoads1() {
		String actual = Calculator.calculate("112234567890 + 112234567890 * (10000000999 - 999)");
		BigInteger res = new BigInteger("1122345679012234567890");
		String expected = "Your result = " + res;
		assertEquals(expected, actual);
	}

	@Test
	void contextLoads2() {
		String actual = Calculator.calculate("command");
		String expected = "Your result = Unknown variable";
		assertEquals(expected, actual);
	}

	@Test
	void contextLoads3() {
		String actual = Calculator.calculate("3 + 8 * ((4 + 3) * 2 + 1) - 6 / (2 + 1)");
		long res = 121;
		String expected = "Your result = " + res;
		assertEquals(expected, actual);
	}

	@Test
	void contextLoads4() {
		String actual = Calculator.calculate("8 * 3 + 12 * (4 - 2)");
		long res = 48;
		String expected = "Your result = " + res;
		assertEquals(expected, actual);
	}

	@Test
	void contextLoads5() {
		String actual = Calculator.calculate("4 * (2 + 3");
		String expected = "Invalid expression";
		assertEquals(expected, actual);
	}

	@Test
	void contextLoads6() {
		String actual = Calculator.calculate("4 + 3)");
		String expected = "Invalid expression";
		assertEquals(expected, actual);
	}

	@Test
	void contextLoads7() {
		String actual = Calculator.calculate("800000000000000000000000 + 100000000000000000000000");
		BigInteger res = new BigInteger("900000000000000000000000");
		String expected = "Your result = " + res;
		assertEquals(expected, actual);
	}

	@Test
	void contextLoads8() {
		String actual = Calculator.calculate("5 6 8");
		long res = 568;
		String expected = "Your result = " + res;
		assertEquals(expected, actual);
	}

}
