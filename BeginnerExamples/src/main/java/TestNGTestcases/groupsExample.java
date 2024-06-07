package TestNGTestcases;

import org.testng.annotations.Test;

public class groupsExample {

	
		
// 3 pairs of mobile ,each pair had different compamy eg apple,orange,blueberry.
		@Test(groups = {"applePhone"})
		public void apple1() {
			System.out.println("apple1");
		}
		 @Test(groups = {"applePhone"})
		 public void apple2() {
		 System.out.println("apple2");
		 }
		 
		 @Test(groups = {"orangePhone"})
		 public void orange1() {
		 System.out.println("apple2");
		 }
		 @Test(groups = {"orangePhone"})
		 public void orange2() {
		 System.out.println("orange2");
		 }
		 
		 @Test(groups = {"blueberryPhone"})
		 public void blueberry1() {
		 System.out.println(" blueberry1");
		 }
		 @Test(groups = {"blueberryPhone"})
		 public void blueberry2andapple() {
		 System.out.println(" blueberry2 and apple");
		 }
	}
	


