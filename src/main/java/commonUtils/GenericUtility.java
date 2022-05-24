package commonUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
	 * @author kumar
	 *
	 */
/**
 * This CommonUtilities class has all generic methods. We can use these methods
 * across the projects. We consider Cucumber-Selenium project as base and
 * converted the common generic libraries of that project
 * 
 */

public class GenericUtility extends BaseTest implements IConst {
	private static final Logger log = LoggerFactory.getLogger(GenericUtility.class.getName());

	/**
	 * JSE click element
	 */
	public void JseClick(WebElement element) {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * JSE Highlight element
	 */
	public void JseHighlightTheElement(WebElement header) throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int iCnt = 0; iCnt < 2; iCnt++) {
			js.executeScript("arguments[0].style.border='5px dotted red';", header);

		}
	}

	/**
	 * User Get screenshot on page
	 */
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}

	/**
	 * visiblity of element
	 */

	public void WaitForTheVisibilityOfElement(WebElement Ele, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOf(Ele));

	}

	/**
	 * User Wait for some time
	 */
	public void wait(int object) throws InterruptedException {
		TimeUnit.SECONDS.sleep(object);
	}

	/**
	 * User scroll to webelement
	 * 
	 */
	public void scrollToview(WebElement element) {
		System.out.println("Scrolling to the Eelement" + element);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	/**
	 * get text
	 */

	public String getText(WebElement string) throws Exception {
		String value = string.getText();
		return value;
	}

	/**
	 * Select expected value from drop down
	 * 
	 * @param webElement       Describe web element of a select drop down
	 * @param actualSelectText Actual text to select in drop down
	 */
	public void selectDropdown(WebElement webElement, String actualSelectText) {
		log.info(String.format("Select expected value - [%s] from dropdown", actualSelectText));
		Select dropDown = new Select(webElement);
		int flag = 0;
		try {
			if (!dropDown.isMultiple()) {
				List<WebElement> dropDownCategories = dropDown.getOptions();
				for (WebElement dropDownCategory : dropDownCategories) {
					if (dropDownCategory.getText().equals(actualSelectText)) {
						flag = 1;
						break;
					}
				}
				if (flag == 1) {
					dropDown.selectByVisibleText(actualSelectText);
				}
			}
		} catch (Exception e) {
			log.error(String.format("Expected value - [%s] is not present in dropdown", actualSelectText));
		}

	}

	/**
	 * click on element
	 */
	public void clickElement(WebElement object) {
		try {
			object.click();
		} catch (final Exception e) {
			e.getMessage();
		}

	}

	/**
	 * click on element from list
	 */
	public void clickElementInList(WebElement object) {
		try {
			((WebElement) object).click();
		} catch (final Exception e) {
			e.getMessage();
		}
	}

	/**
	 * Mouse Hover on an element using the Actions Class
	 */
	public void actionsMouseOver(WebElement element) throws Exception {
		try {
			log.info("Actions Mouse Overing to the Element " + element);
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();
		} catch (Exception e) {
			throw new Exception("Error Occured during the Mouse Over of an Element");
		}
	}

	/**
	 * User enter text in to textField
	 * 
	 */
	public void typeTextToTextBox(WebElement element, String text) throws Exception {
		try {
			log.info("Enter text in to textField: " + text);
			element.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Element is NOT available " + element);
		}
	}
}