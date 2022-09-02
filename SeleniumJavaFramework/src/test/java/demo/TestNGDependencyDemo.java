package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test(dependsOnMethods = {"test2","test3"})
	public void test1() {
		System.out.println("I am inside test 1");
		
	}
	@Test(priority=2)
	public void test2() {
		System.out.println("I am inside test 2");
		
	}
	@Test
	public void test3() {
		System.out.println("I am inside test 1");
		
	}

}
