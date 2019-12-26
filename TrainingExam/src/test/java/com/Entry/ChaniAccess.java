package com.Entry;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ChaniAccess {
	  @BeforeSuite
	    public void beforeSuite(){
	        System.out.println("This is Before Suite");
	    }

	    @Test(enabled = false)
	    public void test(){
	        System.out.println(" This is test");
	    }

	    @Test(timeOut = 5000)
	    public void insert() {
	        try {
	            Thread.sleep(600);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("Chaitanya entered in Diaspark campus");
	    }

	    @Test(dependsOnMethods="insert")
	    public void select() {
	        System.out.println("Chaitanya Shastry parked his vehicle");
	    }

	    @Test(dependsOnMethods="select")
	    public void update() {
	        System.out.println("Swap ID Card");
	    }

	    @Test(dependsOnMethods={"insert","update"})
	    public void delete() {
	        System.out.println("Chaitanya Shastry will Enter in Diaspark premises");
	    }
}
