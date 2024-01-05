package com.example;

import org.testng.annotations.Test;

public class NewTest {
	
	String bookId=null;
	@Test(priority = 1)
	public void booking() {
		System.out.println("booking started ");
		int a=50/0;
		bookId="xyz";
		
	}
	
	@Test(priority = 2,dependsOnMethods = {"booking"})
	public void tracking() {
		
		if(bookId!=null) {
			System.out.println("shipping can be tracked ");
		}
		else {
			System.out.println("booking failed cannot ships");
		}
		
	}

	
	@Test(priority = 3,dependsOnMethods = {"booking"})
	public void cancel() {
		
		if(bookId!=null) {
			System.out.println("shipping can be cancel ");
		}
		else {
			System.out.println("booking failed cannot cancel");
		}
		
	}


}
