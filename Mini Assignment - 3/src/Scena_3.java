import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Scena_3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravikumaa\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        By alerts = By.xpath("/html/body/div[2]/div/ul/li[29]/a");
        driver.findElement(alerts).click();
        Thread.sleep(2000);
        By prompt = By.xpath("/html/body/div[2]/div/div/ul/li[3]/button");
        driver.findElement(prompt).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Text");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        String str = driver.findElement(By.id("result")).getText();
        if (str.contains("Text")) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }
}
