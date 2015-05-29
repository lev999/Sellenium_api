package home.Selenium_1;

import java.io.File;

import net.sourceforge.htmlunit.corejs.javascript.ast.ConditionalExpression;

import org.apache.xpath.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

public class HTML_UNIT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		HtmlUnitDriver driver = new HtmlUnitDriver();
		WebDriver driver = new InternetExplorerDriver(); 
		driver.get("http:www.google.com");
		WebElement element= driver.findElement(By.name("q"));
		element.sendKeys("Cheese");
		element.submit();

		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver input) {
				
				return input.getTitle().toLowerCase().startsWith("cheese");
			}
		});
		System.out.println("Title="+driver.getTitle());
		driver.quit();
	}

}
