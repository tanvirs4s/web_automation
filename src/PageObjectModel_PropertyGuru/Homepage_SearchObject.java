package PageObjectModel_PropertyGuru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


/**
 * Created by tanvir on 7/25/17.
 */
public class Homepage_SearchObject
{
    private static WebElement element = null;

    public static WebElement selectMoreOptions(WebDriver driver)
    {
        element = driver.findElement(By.xpath(".//*[@id='searchbox-n1']/fieldset/div[1]/div/div/div/ul/li[1]/a/span[2]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);
        return null;
    }
    public static WebElement searchButton(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='searchbox-n1']/fieldset/div[2]/div/div[3]/input[2]")));
        return element;
    }

    public static WebElement viewRentOption(WebDriver driver)
    {
        element = driver.findElement(By.xpath(".//*[@id='searchbox-n1']/fieldset/div[1]/div/div/div/div[1]/button"));
        return element;
    }

    public static WebElement selectRentOption(WebDriver driver)
    {
        element = driver.findElement(By.xpath(".//*[@id='searchbox-n1']/fieldset/div[1]/div/div/div/div[1]/ul/li[2]/a"));
        return element;
    }

    public static WebElement viewPriceLink(WebDriver driver)
    {
        element = driver.findElement(By.xpath(".//*[@id='searchbox-n1']/fieldset/div[1]/div/div/div/div[5]/button"));
        return element;
    }

    public static WebElement selectPriceMaximum(WebDriver driver)
    {
        element = driver.findElement(By.xpath(".//*[@id='searchbox-n1']/fieldset/div[1]/div/div/div/div[5]/ul/li[2]/input"));
        return element;
    }

    public static WebElement checkWithPhotos(WebDriver driver)
    {
        element = driver.findElement(By.xpath(".//*[@id='searchbox-n1']/fieldset/div[2]/div/div[2]/fieldset[6]/div[1]/label/input"));
        return element;
    }
    public static WebElement selectMaxPrice15000(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='searchbox-n1']/fieldset/div[1]/div/div/div/div[5]/ul/li[4]/ul/li[18]/a")));
        return element;
    }
}
