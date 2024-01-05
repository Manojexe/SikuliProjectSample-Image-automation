package com.sikuli;

import java.net.URI;
import java.net.URISyntaxException;

import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class LocalToVDIAccess {

	public static void main(String[] args) throws InterruptedException, URISyntaxException {

		// Open the remote desktop application (e.g., MSTSC)
		Screen screen = new Screen();

		screen.type("r", Key.WIN);

		screen.type("mstsc");

		screen.type(Key.ENTER);

		Thread.sleep(5000);

		screen.type("172.23.50.48");

		screen.type(Key.ENTER);

		Thread.sleep(10000);

		screen.type("Anb@12345");

		screen.type(Key.ENTER);

		Thread.sleep(5000);

		screen.type(Key.WIN, Key.UP);

		Thread.sleep(5000);

		screen.type(Key.ENTER);

		Thread.sleep(5000);

		screen.type("r", Key.WIN);

		screen.type("https://finusers-ual.anb.com.sa/fininfra/ui/SSOLogin.jsp");

		Thread.sleep(5000);

		screen.type(Key.ENTER);

		Thread.sleep(15000);

		screen.type(Key.TAB);

		screen.type(Key.TAB);

		Thread.sleep(2000);

		screen.type("Exp033");

		screen.type(Key.TAB);

		screen.type("Anb@1234");

		screen.type(Key.ENTER);

		
		/*
		 * // Set up Chrome options ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--start-maximized");
		 * 
		 * // Launch ChromeDriver with the specified options WebDriver driver = new
		 * ChromeDriver(options);
		 * 
		 * // Perform actions in the browser window
		 * driver.get("https://www.google.com"); // Add more actions as needed
		 * 
		 * // Close the browser and quit the driver driver.quit();
		 * 
		 */		 

		
//		URI url =new URI("");
//		url.getHost();
//		url.getPort();
	}

}
