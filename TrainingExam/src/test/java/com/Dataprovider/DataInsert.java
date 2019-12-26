package com.Dataprovider;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataInsert {
	@BeforeTest
	public void Adminlogin() {
		System.out.println("This is Before test");

	}

	@Test(dataProvider = "providedata")
	public void login(String username, String password) throws IOException, InterruptedException {

		// Admin Login
		System.out.println("This is Adminlogin ");
		// Admin username
		System.out.println("This is Adminlogin " + username);
		Thread.sleep(4000);
		// Admin password
		System.out.println("This is Adminlogin " + password);
		Thread.sleep(4000);

	}

	@DataProvider(name = "providedata")
	public Object[][] passData() {

		// Read data from array using data-provider

		Object[][] data = new Object[5][2];

		data[0][0] = " ";
		data[0][1] = "fffffffff";

		data[1][0] = "ttttttttt";
		data[1][1] = " ";

		data[2][0] = "admdfdfdfdsf";
		data[2][1] = "fefdf@%$@$";

		data[3][0] = " ";
		data[3][1] = " ";

		data[4][0] = "Chaitanya";
		data[4][1] = "chaitanyashastry@123456";

		return data;

	}

	@AfterTest
	public void teardown() {
		System.out.println("This is After test");
	}
}
