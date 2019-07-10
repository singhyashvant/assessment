package com.emirates.assess;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonLibrary {
	WebElement element = null;
	WebDriverWait wait = null;

	public WebElement findElementByID(WebDriver driver,String locatorValue) {
		try {
			waitForElementToClickable(driver,By.id(locatorValue));
			element = driver.findElement(By.id(locatorValue));
			
		} catch (NoSuchElementException e) {
		}
		return element;
	}
	public WebElement findElementByName(WebDriver driver,String locatorValue) {
		try {
			waitForElementToClickable(driver,By.name(locatorValue));
			element = driver.findElement(By.name(locatorValue));
			
		} catch (NoSuchElementException e) {
		}
		return element;
	}
	public WebElement findElementByXpath(WebDriver driver, String locatorValue) {
		try {
			waitForElementToClickable(driver,By.xpath(locatorValue));
			element = driver.findElement(By.xpath(locatorValue));
			
		} catch (NoSuchElementException e) {
		}
		return element;
	}
	public void waitForElementToClickable(WebDriver driver, By e)
	{
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(e));
		
	}
	public void waitForElementToVisible(WebDriver driver, By e)
	{
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(e));
		
	}

}
