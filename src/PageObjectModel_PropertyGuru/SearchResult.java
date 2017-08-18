package PageObjectModel_PropertyGuru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResult
{
    private static WebElement element = null;

    public static WebElement clickFirstSearchResult(WebDriver driver)
    {

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='wrapper-inner']/section/div[2]/div/div/div/section/div[4]/ul/li[1]/div[1]/div[2]/h3/a")));
        return element;
    }
}
