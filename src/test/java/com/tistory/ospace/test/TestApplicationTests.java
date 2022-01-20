package com.tistory.ospace.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

//	@ParameterizedTest
//	@CsvSource(
//		{
//			"foo, 1",
//			"bar, 2"
//			
//		})
	@Test
	public void testCsvSource(String arg1, int arg2) {
		System.out.println(arg1 +", " + arg2);
	}
	
	
	@Test
	public void contextLoads() {
	}

}
