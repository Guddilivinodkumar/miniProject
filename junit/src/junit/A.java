package junit;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class A {

	@Test
	public void test1() {
		//int x=10/0;
		System.out.println("from test1");
	}
	@Test
	public void test2(){
		System.out.println("from test2");
	}
	@BeforeEach
	public void beforeTest(){
		System.out.println("beforeTest");
	}
	@AfterEach
	public void afterTest(){
		System.out.println("afterTest");
	}
	@BeforeAll
	public static void before(){
		System.out.println("before");
	}
	@AfterAll
	public static void after(){
		System.out.println("after");
	}

}
