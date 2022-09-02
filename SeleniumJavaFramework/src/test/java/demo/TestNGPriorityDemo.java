package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	@Test(priority=0)
	public void one() {
		System.out.println("I am inside test 1");
		
	}
	@Test(priority=2)
	public void two() {
		System.out.println("I am inside test 2");
		
	}
	@Test(priority=3)
	public void three() {
		System.out.println("I am inside test 3");
		
	}
	@Test(priority=0)
	public void four() {
		System.out.println("I am inside test 5");
		
	}

}
