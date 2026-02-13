package com.practice.TestingApp;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

@Slf4j
class TestingAppApplicationTests {

	@BeforeEach
	void setUp(){
		log.info("Starting the method");
	}

	@AfterEach
	void tearDown(){
		log.info("Tearing down the method");
	}

	@BeforeAll
	static void setUpOnce(){
		log.info("Setup Once...");
	}

	@AfterAll
	static void tearDownOnce(){
		log.info("Teardown All...");
	}

	@Test
//	@Disabled
	void testNumberOne() {
		int a = 5;
		int b = 3;

		int result = a + b;

//		Assertions.assertEquals(8,result);
		Assertions.assertThat(result).isEqualTo(8);

	}


	@Test
//	@DisplayName("displayNameTestTwo")
	void testDivideTwoNumbers_WhenDenominatorIsZero_ThenArithmeticException(){

		int a = 5;
		int b = 0;

		assertThatThrownBy(() -> divideTwoNumber(a,b))
				.isInstanceOf(ArithmeticException.class)
				.hasMessage("Tried to divide by Zero");
	}

	int addTwoNumbers(int a, int b){
		return a+b;
	}

	double divideTwoNumber(int a, int b){
		try{
			return a/b;
		}catch(ArithmeticException e){
			log.error("Arithmetic Error Occured" +e.getLocalizedMessage());
			throw new ArithmeticException(e.getLocalizedMessage());
		}
	}


}
