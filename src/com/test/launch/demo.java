package com.test.launch;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> header=driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		for(WebElement ele :header)
		{
			String text=ele.getText();
			System.out.println(text);
		}
		System.out.println("==Stream Api===");
		header.forEach((ele)-> {System.out.println(ele.getAttribute("innerText"));});
		Thread.sleep(3400);
		WebElement Search=driver.findElement(By.id("twotabsearchtextbox"));
		Search.sendKeys("Smart Mobile");
		String stext=Search.getAttribute("value");
		System.out.println(stext);
		System.out.println("OutPut");
		}
		
}
