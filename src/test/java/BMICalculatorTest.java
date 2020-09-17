import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BMICalculatorTest {

    @Test
    public void checkStarvationCategory() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        WebElement weightInput = driver.findElement(By.name("wg"));
        weightInput.sendKeys("11");

        WebElement height1Input = driver.findElement(By.name("ht"));
        height1Input.sendKeys("175");


        WebElement calculateButton = driver.findElement(By.name("cc"));
        calculateButton.click();

        WebElement categoryInput = driver.findElement(By.name("desc"));
        String actualCategory = categoryInput.getAttribute("value");

        assertEquals(actualCategory, "Your category is Starvation", "Category should be starvation");
        driver.quit();
    }

    @Test
    public void checkUnderweightCategory() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        WebElement weightInput = driver.findElement(By.name("wg"));
        weightInput.sendKeys("50");

        WebElement height1Input = driver.findElement(By.name("ht"));
        height1Input.sendKeys("175");


        WebElement calculateButton = driver.findElement(By.name("cc"));
        calculateButton.click();

        WebElement categoryInput = driver.findElement(By.name("desc"));
        String actualCategory = categoryInput.getAttribute("value");

        assertEquals(actualCategory, "Your category is Underweight", "Category should be underweight");
        driver.quit();
    }

    @Test
    public void checkNormalCategory() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        WebElement weightInput = driver.findElement(By.name("wg"));
        weightInput.sendKeys("60");

        WebElement height1Input = driver.findElement(By.name("ht"));
        height1Input.sendKeys("175");


        WebElement calculateButton = driver.findElement(By.name("cc"));
        calculateButton.click();

        WebElement categoryInput = driver.findElement(By.name("desc"));
        String actualCategory = categoryInput.getAttribute("value");

        assertEquals(actualCategory, "Your category is Normal", "Category should be normal");
        driver.quit();
    }

    @Test
    public void checkOverweightCategory() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        WebElement weightInput = driver.findElement(By.name("wg"));
        weightInput.sendKeys("80");

        WebElement height1Input = driver.findElement(By.name("ht"));
        height1Input.sendKeys("175");


        WebElement calculateButton = driver.findElement(By.name("cc"));
        calculateButton.click();

        WebElement categoryInput = driver.findElement(By.name("desc"));
        String actualCategory = categoryInput.getAttribute("value");

        assertEquals(actualCategory, "Your category is Overweight", "Category should be Overweight");
        driver.quit();
    }

    @Test
    public void checkObeseCategory() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        WebElement weightInput = driver.findElement(By.name("wg"));
        weightInput.sendKeys("110");

        WebElement height1Input = driver.findElement(By.name("ht"));
        height1Input.sendKeys("175");


        WebElement calculateButton = driver.findElement(By.name("cc"));
        calculateButton.click();

        WebElement categoryInput = driver.findElement(By.name("desc"));
        String actualCategory = categoryInput.getAttribute("value");

        assertEquals(actualCategory, "Your category is Obese", "Category should be obese");
        driver.quit();
    }
}
