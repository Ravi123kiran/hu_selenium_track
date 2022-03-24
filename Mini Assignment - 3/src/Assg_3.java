import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
    public class Assg_3 {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravikumaa\\Downloads\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.google.com");
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/");
            By frames = By.xpath("/html/body/div[2]/div/ul/li[22]/a");
            driver.findElement(frames).click();
            Thread.sleep(2000);
            frames = By.xpath(" /html/body/div[2]/div/div/ul/li[1]/a");
            driver.findElement(frames).click();
            Thread.sleep(2000);
            driver.switchTo().frame("frame-top");
            driver.switchTo().frame("frame-left");
            WebElement l = driver.findElement(By.cssSelector("body"));
            System.out.println(l.getText());
        }
    }

