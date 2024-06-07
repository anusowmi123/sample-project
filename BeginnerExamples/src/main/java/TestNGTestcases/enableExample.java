package TestNGTestcases;

import org.testng.annotations.Test;

public class enableExample {

	@Test
	public void testcase1() {
		System.out.println("hello");
	}
	@Test
	public void testcase2() {
		System.out.println("my");
	}
	@Test
	public void testcase3() {
		System.out.println("name is");
	}
	@Test (enabled = false)
	public void testcase4() {
		System.out.println("Santhosh Subramanium");
	}
}
