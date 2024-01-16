package test;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class MyTestCase {


	@Test
	public void addTest() {
		int sum,a,b;
		a=10;
		b=3;
		sum=a+b;
		
	assertEquals(13, sum);
		
	}
	
	@Test
	public void subTest() {
		int answer,a,b;
		a=10;
		b=3;
		answer=a-b;
		
		assertEquals(7, answer);
	}
	
	@Test
	public void multiplyTest() {
		int answer,a,b;
		a=10;
		b=3;
		answer=a*b;
		
		assertEquals(30, answer);
	}
	
	@Test
	public void loop() {
		long count=0;
		for (int i = 0; i < 10000000; i++) {
			count++;
		}
		
		assertEquals(10000000, count);
	}
}
