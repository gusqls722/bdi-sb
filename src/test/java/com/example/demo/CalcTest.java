package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.util.Calc;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CalcTest {
	
		@Autowired
		private Calc calc;
		
		@Test
		public void addTest() {
			int result = calc.add(4, 4);
			assertEquals(8, result);
		}
		
		@Test
		public void subTest() {
			int result = calc.sub(10, 2);
			assertEquals(8, result);
		}
		
		@Test
		public void mulTest() {
			int result = calc.mul(4, 2);
			assertEquals(8, result);
		}
		
		@Test
		public void divTest() {
			int result = calc.div(16, 2);
			assertEquals(8, result);
		}
		
}
