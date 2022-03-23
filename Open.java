package Chrome_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;


public class Open {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravikumaa\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://phptravels.com/demo");
        driver.manage().window().maximize();
        String s = driver.getTitle();
        compare(s);


        driver.findElement(By.xpath("//a[text()='Login']")).click();
        if (driver.getTitle() == "Login")
            System.out.print("Pass\n");
        else
            System.out.print("Fail\n");

        driver.switchTo().defaultContent();
        By hotels = By.xpath("//a[text()='Pricing']");
        driver.findElement(hotels).click();
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();
    }

    private static void compare(String s) {
        if (s.contains("PHPTRAVELS"))
            System.out.print("Pass\n");
        else
            System.out.print("Fail\n");
    }

}




