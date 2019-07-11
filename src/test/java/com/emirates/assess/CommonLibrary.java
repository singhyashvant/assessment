package com.emirates.assess;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonLibrary {
	List<WebElement> elements = null;
	WebElement element = null;
	WebDriverWait wait = null;
	static Properties prop = null;

	public WebElement findElementByID(WebDriver driver,String locatorValue) {
		try {
			waitForElementToVisible(driver,By.id(locatorValue));
			element = driver.findElement(By.id(locatorValue));
			
		} catch (NoSuchElementException e) {
		}
		return element;
	}
	public WebElement findElementByName(WebDriver driver,String locatorValue) {
		try {
			waitForElementToVisible(driver,By.name(locatorValue));
			element = driver.findElement(By.name(locatorValue));
			
		} catch (NoSuchElementException e) {
		}
		return element;
	}
	public WebElement findElementByXpath(WebDriver driver, String locatorValue) {
		try {
			waitForElementToVisible(driver,By.xpath(locatorValue));
			element = driver.findElement(By.xpath(locatorValue));
			
		} catch (NoSuchElementException e) {
		}
		return element;
	}
	public List<WebElement> findElementsByXpath(WebDriver driver, String locatorValue) {
		try {
			waitForElementToVisible(driver,By.xpath(locatorValue));
			elements = driver.findElements(By.xpath(locatorValue));
			
		} catch (NoSuchElementException e) {
		}
		return elements;
	}
	public void waitForElementToClickable(WebDriver driver, By e)
	{
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(e));
		
	}
	public void waitForElementToVisible(WebDriver driver, By e)
	{
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(e));
		
	}
	public Properties loadProps()
	{
	FileReader reader;
	try {
		reader = new FileReader("./config.properties");
		prop = new Properties();
		prop.load(reader);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (Exception e1) {
		e1.printStackTrace();
	}
	return prop;
	}
}
