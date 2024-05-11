package com.quicktesting.com.Testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}

}
